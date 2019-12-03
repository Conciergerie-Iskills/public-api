# Iskills API - endpoint "getBasicUserData" - version 1
[Back to the index](../README.md)

**This API is not yet available on production systems**

## Summary
Gives back the count of unread messages and unread notifications.

## Request
* No input data is required.
  
# Response
Data example:
```json
{
    "data": {
        "nbUnreadAlerts": 2,
        "nbUnreadMessages": 0
    },
    ...
}
```
Data is made out of two numbers:
* `nbUnreadAlerts` Number. The number of unread notifications. See [getNotifications](GET_NOTIFICATIONS.md) for how to drill down on those notifications.
* `nbUnreadMessages` Number. The number of unread messages for the current user. See [getMessageThreads](GET_MESSAGE_THREADS.md) for how to inspect those messages.

