# Iskills API - endpoint "postMessage" - version 1
[Back to the index](../README.md)

**This API is not yet available on production systems**

## Summary
Post a message in a message thread. Gives back the list of messages in the message thread for the current user.

## Request
* This request is paginated, so a `pageData` element should be provided. This page data is applied to the result of the API, similar to the [getMessageThread api](GET_MESSAGE_THREAD.md).
* Typical input:

```json
{
  "targetId":1234,
  "messageThreadType":"ORDER_COMMENT",
  "messageBody":"Ceci est le corps du message"
}
```

* `targetId` Number. The target Id of the message thread, as provided by the [getMessageThreads api](GET_MESSAGE_THREADS.md)
* `messageThreadType` String. The type of the message thread, as provided by the [getMessageThreads api](GET_MESSAGE_THREADS.md)
* `messageBody` String. The text of the message that is to be posted in the thread.
  
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

The response from this API is the same as the response from the [getMessageThread api](GET_MESSAGE_THREAD.md).
