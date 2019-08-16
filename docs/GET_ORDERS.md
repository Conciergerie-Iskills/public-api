# Iskills API - endpoint "getOrders" - version 1
[Back to the index](../README.md)

# Summary
Gives back the list of the orders of the current user.

# Request
```json
{
  "includeInactive": false
}
```
* `includeInactive` If true, all orders will be returned including the history, otherwise only the active ones (orders not cancelled or completed before the past week) are returned.
  
# Response
Data example:
```json
{
  "data": {
    "active": [
      {
        "date": "03/06/2019 08:23",
        "id": 158058,
        "offreName": "Pressing - nettoyage à sec - Classique",
        "status": "Effectuée",
        "icon": "https://iskills.fr/site/web/bright/images/aplat/rouge-cintre.png",
        "mobileWebLink": "https://iskills.fr/webapp/?/orderDetail/158058",
        "desktopWebLink": "https://iskills.fr/profil/?od=158058",
        "items": [
          "Chemise homme lavée, repassée sur cintre"
        ]
      },
      {
        "date": "05/02/2019 08:38",
        "id": 158040,
        "offreName": "Ménage et Repassage",
        "status": "Enregistrée",
        "icon": "https://iskills.fr/site/web/bright/images/aplat/vert-nettoyage.png",
        "mobileWebLink": "https://iskills.fr/webapp/?/orderDetail/158040",
        "desktopWebLink": "https://iskills.fr/profil/?od=158040",
        "items": [
          "Ménage & Repassage (*)"
        ]
      }
    ],
    "history": [
      {
        "date": "04/02/2019 23:08",
        "id": 158039,
        "offreName": "Cordonnerie pour femme - Classique",
        "status": "Terminée",
        "icon": "https://iskills.fr/site/web/bright/images/aplat/rouge-chaussures.png",
        "mobileWebLink": "https://iskills.fr/webapp/?/orderDetail/158039",
        "desktopWebLink": "https://iskills.fr/profil/?od=158039",
        "items": [
            "Talons moyens (cuir)"
        ]
      },
      {
        "date": "24/05/2018 12:16",
        "id": 114547,
        "offreName": "La sélection de cadeaux",
        "status": "Terminée",
        "icon": "https://iskills.fr/site/web/bright/images/aplat/rouge-cadeau.png",
        "mobileWebLink": "https://iskills.fr/webapp/?/orderDetail/114547",
        "desktopWebLink": "https://iskills.fr/profil/?od=114547",
        "items": [
            "Infuseur Buddy menthe"
        ]
      },
      {
        "date": "15/03/2013 10:30",
        "id": 2322,
        "offreName": "PRESSING NETTOYAGE A SEC",
        "status": "Terminée",
        "icon": "https://iskills.fr/site/web/bright/images/aplat/rouge-cintre.png",
        "mobileWebLink": "https://iskills.fr/webapp/?/orderDetail/2322",
        "desktopWebLink": "https://iskills.fr/profil/?od=2322",
        "items": [
            "Pantalon",
            "Veste"
        ]
      }
    ]
  }
}
```
Data is made out of a list of orders:
* `date` Date the order was placed (Timezone Europe/Paris)
* `id` Number, unique identifier for the order.
* `offreName` Name of the service being ordered.
* `status` Current status of the order.
* `icon` URL of the icon representing the service.
* `mobileWebLink` URL to send this user to link to the details of the order. *Note:* This is the preferred URL to be used in a webview or on the web on mobile phones.
* `desktopWebLink` URL to send this user to link to the details of the order. *Note:* This is the preferred URL to be used to send the user in a browser, dektop, tablet.
* `items` Items being ordered on the service.

