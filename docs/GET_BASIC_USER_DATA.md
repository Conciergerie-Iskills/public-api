# ARMONIA Conciergerie API - endpoint "getBasicUserData" - version 1
[Back to the index](../README.md)

## Summary
Gives back the count of unread messages and unread notifications. A host application calls it to display an unread badge on the tile that opens the conciergerie.

## Request
* No input data is required.

## Response
Data example:
```json
{
    "data": {
        "nbUnreadAlerts": 2,
        "nbUnreadMessages": 0,
        "alertsStatus": "f3a91c0d",
        "messagesStatus": "nothing",
        "serverVersion": "68b76343c"
    },
    ...
}
```
* `nbUnreadAlerts` Number. The number of unread notifications. See [getNotifications](GET_NOTIFICATIONS.md) to drill down on those notifications.
* `nbUnreadMessages` Number. The number of unread messages for the current user. See [getMessageThreads](GET_MESSAGE_THREADS.md) to inspect those messages.
* `alertsStatus` String. Opaque value that changes whenever the user's notifications change (`"nothing"` if the user has none). Compare it with the previous value to know whether notifications must be reloaded.
* `messagesStatus` String. Same as `alertsStatus`, for messages.
* `serverVersion` String, optional. Build identifier of the platform.
* `currentGame` Object, optional. Used by the ARMONIA apps only; integrators can ignore it.
