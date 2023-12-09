# Projet Microservices avec Spring Cloud

Ce projet implémente une architecture microservices avec les technologies de Spring Cloud, comprenant un serveur de découverte Eureka, des microservices clients, un service de passerelle (Gateway) et une application de gestion de voitures connectée à une base de données MySQL. Les microservices sont créés à l'aide de Spring Boot et la communication entre eux est réalisée via REST et OpenFeign.

## Structure du Projet

### Eureka_Server

- Microservice de découverte Eureka qui permet l'enregistrement et la découverte dynamique des services.

### EurekaClientApplication

- Microservice client utilisant Eureka pour l'enregistrement dynamique.
- Implémente un service REST pour la gestion des clients.
- Connecté à une base de données H2 en mémoire pour stocker les informations des clients.

### EurekaVoiture

- Microservice gérant les informations liées aux voitures.
- Utilise Feign pour la communication avec le microservice client (EurekaClientApplication).
- Connecté à une base de données MySQL pour stocker les informations des voitures et des clients.

### GateWay

- Microservice Gateway qui dirige les requêtes vers les microservices appropriés.
- Configure le routage dynamique à l'aide de Spring Cloud Routing Gateway.
- Intégré avec Eureka pour la découverte des services.

## Déploiement

### Prérequis

- Java JDK 8 ou supérieur
- Maven
- MySQL Server
- IDE (IntelliJ recommandé)

### Instructions

1. Clonez le projet depuis GitHub.

git clone https://github.com/Amellalzakaria/Microservices-_Spring_Cloud_Client_Vehicle_Management.git

2-Import the projects into your IDE (IntelliJ, Eclipse, etc.).

3-Configure the MySQL database:

4-Create a database named eurikavoiture99. (YES!!!!! "eurika" with "i")
5-Set connection parameters in the application.properties files of microservices using MySQL.
6-Start the microservices in the following order:

Eureka_Server
EurekaClientApplication
EurekaVoiture
Gateway
7-Access the Eureka interface at http://localhost:8761/ to check service registration.

8-Test microservices features via the Gateway interface at http://localhost:8088/.
