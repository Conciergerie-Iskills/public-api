# ARMONIA Conciergerie API - endpoint "ackNotifications" - version 1
[Back to the index](../README.md)

## Summary
Mark specific notifications as "read".

## Request
```json
{
  "notificationIds": [12, 35, 90],
  "unread": false
}
```
* `notificationIds` A list of notification IDs that has to be marked as read. These IDs are those provided by [getNotifications](GET_NOTIFICATIONS.md).
* `unread` Boolean, optional, defaults to `false`. When `true`, the notifications are marked as unread instead.

## Response
The response is the same as the [getBasicUserData](GET_BASIC_USER_DATA.md).

