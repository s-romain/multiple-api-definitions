# Multiple OpenAPI definitions

## Installation

````shell
mvn clean install
````

## Lancement du Web Service

### Profil admin
````shell
java -jar target/demo-0.0.1-SNAPSHOT.jar --spring.profiles.active=admin
````

### Profil consultation
````shell
java -jar target/demo-0.0.1-SNAPSHOT.jar --spring.profiles.active=admin
````

### API publique uniquement
````shell
java -jar target/demo-0.0.1-SNAPSHOT.jar
````
