# Iskills API - endpoint "getNotifications" - version 1
[Back to the index](../README.md)

## Summary
Gives back the list of the notifications for the current user.

## Request
```json
{
  "includeAcked": true
}
```
* `includeAcked` If true, all notifications will be returned, otherwise only the un-acked ones are returned. Acked notifications do expire after some delay and cannot be retrieved anymore.
  
# Response
Data example:
```json
{
  "data": [
    {
        "id": 1849,
        "targetId": 174954,
        "type": 4,
        "acknowledged": false,
        "message": "Votre commande 174954 est disponible.",
        "date": "09/08/2019 17:50",
        "mobileWebLink": "http://dev.iskills.fr/webapp/?/orderDetail/174954",
        "desktopWebLink": "http://dev.iskills.fr/profil/?od=174954"
    },
    {
        "id": 1851,
        "targetId": 174954,
        "type": 3,
        "acknowledged": false,
        "message": "Nouveau commentaire: Petite retouche nécéssaire sur votre manteau. Merci de revenir vers nous.",
        "date": "09/08/2019 18:29",
        "mobileWebLink": "http://dev.iskills.fr/webapp/?/orderDetail/174954",
        "desktopWebLink": "http://dev.iskills.fr/profil/?od=174954"
    }
  ]
}
```
Data is made out of a list of notifications:
* `targetId` Number. Identifier of the target object. Often, an order.
* `type` Number. Type of the notification. Can be one of:
  * 1 - Internal type.
  * 2 - Internal type.
  * 3 - New comment or bill on an order. Target is the ID of the corresponding order.
  * 4 - An order is ready to be collected. Target is the ID of the corresponding order.
* `id` Unique identifier for the notification.
* `acknowledged` Boolean. True if this notifications has already been dismimssed by the user. Note, notifications that are not dismissed comes first in this list. After this split, they are sorted by ascending age (most recent first).
* `message` Text to be displayed to the user.
* `date` Date of the notification.
* `mobileWebLink` URL to send this user to link to the details of the order. *Note:* This is the preferred URL to be used in a webview or on the web on mobile phones.
* `desktopWebLink` URL to send this user to link to the details of the order. *Note:* This is the preferred URL to be used to send the user in a browser, dektop, tablet.

