#scexample - Spring Cloud Example

## Authentication
* JWT authentication

## How to run
* java -jar config-service/target/config-service-1.0-SNAPSHOT.jar ---spring.profiles.active=native to open http://localhost:8088
* java -jar discovery-service/target/discovery-service-1.0-SNAPSHOT.jar to open http://localhost:8061/
* java -jar example-service/target/example-service-1.0-SNAPSHOT.jar to open http://localhost:8090/
* java -jar employee-service/target/employee-service-1.0-SNAPSHOT.jar to open http://localhost:8091/
* java -jar gateway-service/target/gateway-service-1.0-SNAPSHOT.jar to open http://localhost:8060/ using geteway without swagger
* java -jar gateway-service/target/gateway-service-1.0-SNAPSHOT.jar to open http://localhost:8060/ using zuul with swagger

## Rest
* http://localhost:8080/swagger-ui.html to see REST API implmentation

## Build
mvn clean install

# References
* https://piotrminkowski.wordpress.com/2018/04/26/quick-guide-to-microservices-with-spring-boot-2-0-eureka-and-spring-cloud/
* https://github.com/piomin/sample-spring-microservices-new
* https://github.com/ityouknow/spring-cloud-examples
* http://www.baeldung.com/swagger-2-documentation-for-spring-rest-api

# Issues
* sample