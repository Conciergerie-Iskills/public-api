# Iskills API - endpoint "getMessageThreads" - version 1
[Back to the index](../README.md)

*This API is not yet available on production systems*

## Summary
Gives back the list of the message threads for the current user.

## Request
* This request is paginated, so a `pageData` element should be provided.
* No other input is required.
  
# Response
Data example:
```json
{
    "data": {
        "threads": [
            {
                "type": "ORDER_COMMENT",
                "targetId": 12345,
                "lastMessage": "06/10/2019 18:39",
                "lastMessagePreview": "Prestation non réalisée",
                "numberOfMessages": 7,
                "numberOfUnreadMessages": 1,
            },
            ...
        ]
    },
    ...
}
```
Data is made out of a single array `threads` for which each object contains:
* `targetId` Number. Identifier of the target object. Often, an order.
* `type` String (enum). The type of the message thread. `"ORDER_COMMENT"` means the thread is about an order.
* `lastMessage` String. The date of the last message in the thread.
* `lastMessagePreview` String. A textual representation of the last message. May be partial.
* `numberOfMessages` Number. The number of messages in the thread.
* `numberOfUnreadMessages` Number. The number of unread messages in the thread.

