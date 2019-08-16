# Iskills Public API, v1.0.0

## Code
* You can find typescript interfaces of the public API in the `ts` folder of this repository.
* You can find java classes of the public API in the `java` folder of this repository.

## Concepts
### Endpoins
Iskills API is accessible from the internet through https.
Every call to the API is a http(s) POST request on a URL like 
`https://iskills.fr/api/getNotifications/1` where :

* `https://iskills.fr/api/` is the api root
* `getNotifications` is the endpoint being called
* `1` is the version of the endpoint being called. Endpoint documentation (below) refers to the different versions of the endpoints. New versions of the endpoints are created to avoid breaking changes in the API in regard to existing clients. Note that adding a property in a JSON tree is not considered as being a breaking change.

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
  "data": ...
}
```

* `auth` Contains information able to identify the user for which the request is made. There are today two ways to authenticate a request, `ssoToken` and `sessionId` and both should be used exclusively, depending on the type of authentication of the client.
* `ssoToken` Contains the clientId (provided by Iskills during setup) and the sso token from the client, which will be validated by Iskills.
* `sessionId` A session that has been obtained through regular login.
* `data` Body of the request, depends on the endpoint.
* `client` A string representing the client device / app calling the service. Iskills should be able to easily identify if the call comes from a browser or an app, a server or a customer device. Examples used by iskills:
  * `Iskills iOS App v1.0.2 build ef1125`
  * `Iskills Website v1.0.2 build ef1125`
  * `Iskills Monitoring Tool v3.1.1 build f54d22`
  
### 1.2 Response with status code 200
When all goes well, every endpoint answers with the following informations:
```json
{
  "message":"Login ou mot de passe incorrect",
  "code":2,
  "notifications":7,
  "generatedTime":1549001938335,
  "data": ...
}
```
* `message` Value might need to be displayed to the user, depending to the code. Will be a human readable message.
* `code` Return code. Will dictate the next actions to be taken by the caller. The message contains a human readable description of the issue. Possible values are:
  * `0` OK: Request succeeded. Client can proceed with the content of the data field.
  * `1` INVALID_SESSSION: User must reauthenticate.
  * `2` INSUFFICIENT_CREDENTIALS: User is not allowed to access this data / perform this action.
  * `10` MOVE_TO_OTHER_ROOT: Calls to this API for this user must be placed to another root.
  * `11` SSO_ERROR: Some error occured while trying to authenticate the user through SSO.
* `notifications` Number of unread notifications for the user.
* `generatedTime` Server timestamp for the user.
* `data` Data returned by the endpoint.

### 1.3 Response with status code 400 or 500
If something goes wrong, every endpoint answers with status code 400 if the request was incorrect or 500 if an error occured on the server. The body of the response contains the following informations:
```json
{
  "message":"No auth provided in request",
}
```
* `message` Will be a human readable message describing what went wrong.

## Endpoints
* [getNotifications](docs/GET_NOTIFICATIONS.md)
* [ackNotifications](docs/ACK_NOTIFICATIONS.md)
* [getOrders](docs/GET_ORDERS.md)
