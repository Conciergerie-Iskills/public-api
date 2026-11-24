# ARMONIA Conciergerie Public API, v1.0.0

Public API of the ARMONIA Conciergerie platform (formerly Iskills / Enfin Lundi). It lets a client's own application show unread notifications and messages, and open the conciergerie for the signed-in user.

## Code
* TypeScript interfaces of the API are in the `ts` folder.
* Java classes of the API are in the `java` folder.
* An OpenAPI 3 description of the endpoints used for app integration is in [`openapi.yaml`](openapi.yaml).

## Integrating the conciergerie into a client application
The usual integration is a tile in the client's mobile app (or intranet) that opens the conciergerie, with an unread badge.

### Opening the conciergerie in a WebView, already signed in
* Authentication is federated with SAML 2.0, IdP-initiated: the client application (or its identity provider) posts a signed SAML assertion to the conciergerie page opened in the WebView. The user lands on the conciergerie signed in, without entering credentials again.
* The assertion signature is checked against the client's identity provider certificate, and its validity period (`NotOnOrAfter`) is enforced.
* Setup: ARMONIA provides its service provider metadata (assertion consumer service URL, certificate); the client provides its identity provider metadata. The user is identified by e-mail address and by a stable identifier (an attribute or the `NameID`); attribute names are agreed during setup.
* Multi-factor authentication is handled by the client's identity provider.
* The conciergerie pages are responsive and adapt to a WebView: the client's colours and logo are applied, and the bottom action bar can be folded into a menu at the top to avoid two action bars at the bottom of the screen.
* Links returned by the API come in two flavours: `mobileWebLink` (to open in a WebView or on a mobile browser) and `desktopWebLink`.

### Unread badge
* Call [getBasicUserData](docs/GET_BASIC_USER_DATA.md) to get the number of unread notifications and messages.
* Optionally, call [getNotifications](docs/GET_NOTIFICATIONS.md) and [ackNotifications](docs/ACK_NOTIFICATIONS.md) to list them and mark them as read.

### Usage and licensing
* API access is included in the conciergerie service, at no extra cost, without request quota.
* Fair use is expected: refresh the badge when the app opens or comes back to the foreground, or every few minutes, not continuously.
* An integration test environment and test accounts are provided on request.

## Concepts
### Endpoints
The API is accessible from the internet through HTTPS.
Every call to the API is an HTTPS POST request on a URL like
`https://conciergerie.armonia.team/api/getNotifications/1` where:

* `https://conciergerie.armonia.team/api/` is the API root
* `getNotifications` is the endpoint being called
* `1` is the version of the endpoint being called. Endpoint documentation (below) refers to the different versions of the endpoints. New versions of the endpoints are created to avoid breaking changes for existing clients. Adding a property in a JSON tree is not considered a breaking change.

Headers must contain the following:
* `Accept: application/json`
* `Content-Type: application/json`

The endpoint also requires a body which contains the following information:
```json
{
  "auth":{
    "ssoToken": {
      "clientId": "28b4779c-e707-45b0-85b6-a8f0a266c9de",
      "ssoToken": "a8f0a266c9de"
    },
    "sessionId": "50330E8C3356C130A6217A617F3D9CAFE20356C7B77C78FEE3037C48FC26AEF06D176222A38719D1"
  },
  "client": "",
  "pageData":{
    "firstElementIndex":0,
    "numberOfElements":25
  },
  "data": ...
}
```

* `auth` Identifies the user for which the request is made. There are two ways to authenticate a request, `ssoToken` and `sessionId`; use only one of them, depending on how the client authenticates.
  * `ssoToken` Contains the clientId (provided by ARMONIA during setup) and the SSO token from the client, which is validated by ARMONIA.
  * `sessionId` A session obtained through regular login.
* `data` Body of the request, depends on the endpoint.
* `pageData` When applicable, the page information. Optional. A default page size is applied if this information is missing.
  * `firstElementIndex` The offset of the first element. The first element is at index 0.
  * `numberOfElements` The maximum number of elements to be returned. Should be > 0.
* `client` A string identifying the device or app calling the service, so that calls from a browser, an app, a server or a customer device can be told apart. Examples:
  * `Acme Intranet App iOS v1.0.2 build ef1125`
  * `ARMONIA Website v1.0.2 build ef1125`

### Response with status code 200
When all goes well, every endpoint answers with the following information:
```json
{
  "message":"Login ou mot de passe incorrect",
  "code":2,
  "generatedTime":1549001938335,
  "pageInformation": {
      "firstElementIndex": 0,
      "numberOfElements": 5,
      "totalNumberOfElements": 13
  },
  "data": ...
}
```
* `message` Human-readable message, which may need to be displayed to the user depending on the code.
* `code` Return code. Dictates the next action of the caller. Possible values are:
  * `0` OK: Request succeeded. The caller can use the content of the `data` field.
  * `1` INVALID_SESSSION: The user must authenticate again.
  * `2` INSUFFICIENT_CREDENTIALS: The user is not allowed to access this data or perform this action.
  * `10` MOVE_TO_OTHER_ROOT: Calls for this user must be sent to another API root.
  * `11` SSO_ERROR: An error occurred while authenticating the user through SSO.
* `pageInformation` When applicable, the page information. Only returned by endpoints that accept a `pageData` parameter.
  * `firstElementIndex` The offset of the first element. The first element of a set is at index 0.
  * `numberOfElements` The number of elements returned.
  * `totalNumberOfElements` The total number of elements in this set.
* `generatedTime` Server timestamp.
* `data` Data returned by the endpoint.

### Response with status code 400 or 500
If something goes wrong, every endpoint answers with status code 400 if the request was incorrect, or 500 if an error occurred on the server. The body of the response contains:
```json
{
  "message":"No auth provided in request"
}
```
* `message` Human-readable message describing what went wrong.

## Endpoints
* Unread count:
  * [getBasicUserData](docs/GET_BASIC_USER_DATA.md)
* Notifications:
  * [getNotifications](docs/GET_NOTIFICATIONS.md)
  * [ackNotifications](docs/ACK_NOTIFICATIONS.md)
* Messaging:
  * [getMessageThreads](docs/GET_MESSAGE_THREADS.md)
  * [getMessageThread](docs/GET_MESSAGE_THREAD.md)
  * [postMessage](docs/POST_MESSAGE.md)
  * [ackMessage](docs/ACK_MESSAGE.md)
* Order history:
  * [getOrders](docs/GET_ORDERS.md)
