# 🚗 Fleet Management API

A production-ready Spring Boot microservice for managing vehicle records.

This backend project demonstrates REST API development, layered architecture, validation, centralized exception handling, unit testing, Dockerization, and cloud deployment.

---

## 🔥 Live Demo

**Base URL:**  
https://fleet-management-api-0oou.onrender.com

Example endpoint:

POST https://fleet-management-api-0oou.onrender.com/api/vehicles


---

## 🛠 Tech Stack

| Layer | Technology |
|-------|------------|
| Language | Java 17 |
| Framework | Spring Boot 3.2.5 |
| Persistence | Spring Data JPA |
| Validation | Jakarta Bean Validation |
| Database | H2 (Local), PostgreSQL Support |
| Testing | JUnit 5, Mockito |
| Containerization | Docker |
| Deployment | Render |

---

## 📦 Features

- RESTful CRUD APIs  
- Layered architecture (Controller → Service → Repository)  
- Input validation with structured error responses  
- Global exception handling  
- Unit testing for service layer (Mockito)  
- Dockerized application  
- Public cloud deployment  

---

## 🧱 Architecture


Controller → Service → Repository → Database


- **Controller** handles HTTP requests  
- **Service** contains business logic  
- **Repository** manages data persistence using JPA  
- **Database** stores vehicle records  

---

## 📌 API Endpoints

Base Path:

https://fleet-management-api-0oou.onrender.com/api/vehicles


---

### 🟢 Create Vehicle

**POST** `/api/vehicles`

Request Body:

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
📍 Get Vehicle by ID
GET /api/vehicles/{id}
✏️ Update Vehicle
PUT /api/vehicles/{id}
🗑️ Delete Vehicle
DELETE /api/vehicles/{id}
🚨 Validation & Error Handling

Invalid input returns a structured response:

{
  "errors": {
    "vin": "VIN cannot be empty",
    "model": "Model cannot be empty"
  },
  "timestamp": "2026-02-28T18:28:47.8874171",
  "status": 400
}
🧪 Testing

Run all tests:

./mvnw test

✔ Service-layer unit tests using Mockito
✔ Validation behavior verification

🚀 Run Locally

Build:

./mvnw clean install

Run:

java -jar target/fleetapi-0.0.1-SNAPSHOT.jar

Access locally:

http://localhost:8080/api/vehicles
🐳 Docker

Dockerfile included for containerized deployment.

Build Docker image:

docker build -t fleetapi .

Run container:

docker run -p 8080:8080 fleetapi
🌍 Deployment

Deployed on Render using Docker.

Live API:
https://fleet-management-api-0oou.onrender.com

📁 Project Structure
fleet-management-api/
├── src/
│   ├── main/java/com/amisha/fleetapi
│   │   ├── controller/
│   │   ├── service/
│   │   ├── repository/
│   │   ├── entity/
│   │   └── exception/
│   └── test/java/com/amisha/fleetapi
├── Dockerfile
├── mvnw
├── pom.xml
└── README.md
👩‍💻 Author

Amisha Sahu
Spring Boot Backend Project
