# Iskills API - endpoint "ackMessage" - version 1
[Back to the index](../README.md)

**This API is not yet available on production systems**

## Summary
Allows a user agent to mark a series of messages as being "read".

## Request
* Typical input:

```json
{
  "targetId":1234,
  "messageThreadType":"ORDER_COMMENT",
  "messageIds": [143, 5543];
}
```

* `targetId` Number. The target Id of the message thread, as provided by the [getMessageThreads api](GET_MESSAGE_THREADS.md) or the  [getMessageThread api](GET_MESSAGE_THREAD.md)
* `messageThreadType` String. The type of the message thread, as provided by the [getMessageThreads api](GET_MESSAGE_THREADS.md) or the  [getMessageThread api](GET_MESSAGE_THREAD.md)
* `messageIds` number[]. The id of the messages to be marked as "read" as provided by the [getMessageThread api](GET_MESSAGE_THREAD.md)
  
# Response
The response is the same as the [getBasicUserData](GET_BASIC_USER_DATA.md).
