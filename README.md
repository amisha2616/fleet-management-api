# 🚗 Fleet Management API

A **production-ready Spring Boot microservice** for managing vehicle records.  
This backend service demonstrates REST API design, validation, exception handling, unit testing, Dockerization, and cloud deployment.

---

## 🔥 Live Demo

**Base URL (Deployed on Render):**  
https://fleet-management-api-0oou.onrender.com

Try the API:
POST https://fleet-management-api-0oou.onrender.com/api/vehicles

---

## 🛠 Tech Stack

| Layer | Technology |
|-------|------------|
| Language | Java 17 |
| Framework | Spring Boot 3.2.5 |
| Persistence | Spring Data JPA |
| Validation | Jakarta Bean Validation |
| Database | H2 (Local), PostgreSQL support |
| Testing | JUnit 5, Mockito |
| Containerization | Docker |
| Deployment | Render |

---

## 📦 Features

✔ RESTful CRUD endpoints  
✔ Layered architecture (Controller → Service → Repository)  
✔ Request input validation  
✔ Centralized global exception handling  
✔ Unit testing (Service layer)  
✔ Dockerized application  
✔ Cloud-deployed with public API access

---

## 📌 API Endpoints

> **Base Path:**  
> `https://fleet-management-api-0oou.onrender.com/api/vehicles`

---

### 🟢 Create Vehicle

**POST** `/api/vehicles`

**Request Body:**

```json
{
  "vin": "VIN12345",
  "model": "Tesla Model 3",
  "firmwareVersion": "v1.0.0",
  "lastServiceDate": "2026-02-28"
}
Response:
{
  "id": 1,
  "vin": "VIN12345",
  "model": "Tesla Model 3",
  "firmwareVersion": "v1.0.0",
  "lastServiceDate": "2026-02-28"
}
📋 Get All Vehicles
GET /api/vehicles

Get Vehicle By ID
GET /api/vehicles/{id}

Update Vehicle
PUT /api/vehicles/{id}

Delete Vehicle
DELETE /api/vehicles/{id}

Validation & Errors
Invalid requests return a structured response:
{
  "errors": {
    "vin": "VIN cannot be empty",
    "model": "Model cannot be empty"
  },
  "timestamp": "2026-02-28T18:28:47.8874171",
  "status": 400
}
Testing
Run all unit tests:
./mvnw test
🚀 Running Locally
Build
./mvnw clean install
Run
java -jar target/fleetapi-0.0.1-SNAPSHOT.jar
Access locally:
http://localhost:8080/api/vehicles
Docker
Dockerfile is included.
Build Image
docker build -t fleetapi .
Run Container
docker run -p 8080:8080 fleetapi
Deployment
This project is deployed on Render using Docker.

Live API:
🔗 https://fleet-management-api-0oou.onrender.com
About the Author
Amisha Sahu
