# Iskills API - endpoint "ackNotifications" - version 1
[Back to the index](../README.md)

## Summary
Mark specific notifications as "read".

## Request
```json
{
  "notificationIds": [12, 35, 90]
}
```
* `notificationIds` A list of notification IDs that has to be marked as read. These IDs are those provided by [getNotifications](GET_NOTIFICATIONS.md).

## Response
The response is the same as the [getBasicUserData](GET_BASIC_USER_DATA.md).

