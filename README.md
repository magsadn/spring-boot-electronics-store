
[![MIT License][license-shield]][license-url]
[![LinkedIn][linkedin-shield]][linkedin-url]

# spring-boot-electronics-store

The central interface in the Spring Data repository abstraction is Repository. It takes the domain class to manage as well as the ID type of the domain class as type arguments. This interface acts primarily as a marker interface to capture the types to work with and to help you to discover interfaces that extend this one. The CrudRepository interface provides sophisticated CRUD functionality for the entity class that is being managed.

You can use to Postman or Advanced REST Client by MuleSoft for JSON requests.

JSON requests: 

GET, get all brands : http://localhost:8080/api/brands

GET, get brand by id : http://localhost:8080/api/brands/{id}

POST, create a brand : http://localhost:8080/api/brands

PUT, update a brand : http://localhost:8080/api/brands

DELETE, delete a brand : http://localhost:8080/api/brands/{id}

Create a brand body : { "id": "", "name": "" }

Update a brand body : { "id": "",(if exists) "name": "" }

--------------------------------------------------------

GET, get all models : http://localhost:8080/api/models

GET, get model by id : http://localhost:8080/api/models/{id}

POST, create a model : http://localhost:8080/api/models

PUT, update a model : http://localhost:8080/api/models

DELETE, delete a model : http://localhost:8080/api/models/{id}

Create a model body : {"id": "", "name": "", "modelType": ""}

Update a model body : { "id": "",(if exists) "name": "", "modelType": ""}

---------------------------------------------------------

GET, get all modelproperties : http://localhost:8080/api/modelproperties

GET, get modelproperty by id : http://localhost:8080/api/modelproperties/{id}

POST, create a modelproperty : http://localhost:8080/api/modelproperties

PUT, update a modelproperty : http://localhost:8080/api/modelproperties

DELETE, delete a brand : http://localhost:8080/api/modelproperties/{id}

Create a modelproperty body : {"id": "", "price": "", "cpu": "", "ram": "", "screen": "", "camera": "", "battery": "", "stockCount": "", "storage": "", "nfc": "", "bluetooth": "", "wifi": "", "connection": "", "chargeType": "", "extraProperty": ""}

Update a modelproperty body : { "id": ,(if exists) "price": "", "cpu": "", "ram": "", "screen": "", "camera": "", "battery": "", "stockCount": "", "storage": "", "nfc": "", "bluetooth": "", "wifi": "", "connection": "", "chargeType": "", "extraProperty": ""}

[license-shield]: https://img.shields.io/github/license/magsadn/spring-boot-electronics-store?style=for-the-badge
[license-url]: https://github.com/magsadn/spring-boot-electronics-store/blob/main/LICENSE.txt
[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=249
[linkedin-url]: https://www.linkedin.com/in/magsad/
