# Iskills API - endpoint "ackNotifications" - version 1
[Back to the index](../README.md)

## Summary
Mark specific notifications as "read".

##Request
```json
{
  "notificationIds": [12, 35, 90]
}
```
* `notificationIds` A list of notification IDs that has to be marked as read. These IDs are those provided by [getNotifications](GET_NOTIFICATIONS.md).

## Response
No data is included in the response. A `code` 0 indicates the operation completed successfully.

