# Resource Server - Eureka


## Versions
- Java: 21
- Spring Boot: 3.5.6
- Spring Cloud: 2025.0.0

The APIs can only be accessed after providing authorized access token in the headers of the request URI
and passes through a Gateway using **Eureka Server**    .

Blockage of http requests through CORS is also handled in ** SecurityConfig ** java file.

Note: When using API Gateway for routing this microservice's APIs, disable the CORS handling implementation as that has already been handled in that project, 
else the project won't work.