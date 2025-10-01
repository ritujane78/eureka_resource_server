# Resource Server - Eureka

## Versions
- **Java:** 21
- **Spring Boot:** 3.5.6
- **Spring Cloud:** 2025.0.0

---

## Project Overview
This microservice provides APIs that can only be accessed with an **authorized access token** included in the request headers.  
All requests pass through a **Gateway** using **Eureka Server** for service discovery and routing.

### CORS Handling
CORS (Cross-Origin Resource Sharing) issues are handled in the **`SecurityConfig`** Java file.

> **Note:**  
> When using the **API Gateway** to route requests to this microservice's APIs, disable the CORS handling in this service.  
> The Gateway already handles CORS, and enabling it here will cause the project to fail.

---
