# Hazelcast avec Spring-Boot 

#### Mode utilisé : Hazelcast Embedded Architecture 
(un noeud Hazelcast par serveur d'application)

Projet permettant de lancer plusieurs instances d'une application Spring-Boot, chacune embarquant un noeud Hazelcast.
Ceci permet de créer un cluster Hazelcast, et de partager des données entres les applications, donc entre les JVM.

Les services REST exposés permettent d'effectuer les actions suivantes :
- Compter les messages dans la file : http://localhost:{port}/count
- Ajouter un message dans la file : http://localhost:{port}/put?message=supermessage
- Consommer un message dans la file : http://localhost:{port}/get


Ainsi, un première instance de l'application peut produire des messages pendant qu'une seconde instance les consomme.