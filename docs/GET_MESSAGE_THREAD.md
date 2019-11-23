# Iskills API - endpoint "getMessageThread" - version 1
[Back to the index](../README.md)

*This API is not yet available on production systems*

## Summary
Gives back the list of messages in a message thread for the current user.

## Request
* This request is paginated, so a `pageData` element should be provided.
* Typical input:

```json
{
  "targetId":1234,
  "messageThreadType":"ORDER_COMMENT"
}
```

* `targetId` Number. The target Id of the message thread, as provided by the [getMessageThreads api](GET_MESSAGE_THREADS.md)
* `messageThreadType` String. The type of the message thread, as provided by the [getMessageThreads api](GET_MESSAGE_THREADS.md)
  
# Response
Data example:
```json
{
  "data": {
    "elements": [
      {
        "id": 4650,
        "content": "Nous vous informons que votre commande est disponible à la conciergerie.",
        "date": "30/11/2019 12:41",
        "fromCurrentUser": false,
        "fromUserDescription": "Iskills",
        "acknowledged": true
      }
    ],
    "targetId": 1234,
    "messageThreadType": "ORDER_COMMENT",
    "description": "1234: Pressing - PRESSING NETTOYAGE A SEC"
  }
}
```
Data is made out of several properties:
* `targetId` Number. Identifier of the target object. Often, an order.
* `messageThreadType` String. The type of objects referenced by `targetId`.
* `description` String. A human readable description of the target object.
* `elements` An array that holds the messages in the thread. Each item is made of :
  * `id` Number. The unique identifier of the message.
  * `content` String. The text content of the message.
  * `date` String. The date at which the message was posted.
  * `fromCurrentUser` Boolean. True if the user posting the message is the same as the user placing this api call.
  * `fromUserDescription` String. A textual representation of the message author.
  * `acknowledged` Boolean. True if the message has already been acknowledged.
