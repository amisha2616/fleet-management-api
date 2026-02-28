🚗 Fleet Management API

A production-ready Spring Boot microservice for managing vehicle records.

This project demonstrates REST API development, layered architecture, validation, exception handling, unit testing, Dockerization, and cloud deployment.

🔥 Live Demo

Base URL
https://fleet-management-api-0oou.onrender.com

Example Endpoint
POST /api/vehicles

🛠 Tech Stack

Java 17

Spring Boot 3.2.5

Spring Data JPA

H2 (configurable for PostgreSQL)

Jakarta Validation

JUnit 5 & Mockito

Docker

Render (Cloud Deployment)

📦 Features

RESTful CRUD APIs

Layered architecture (Controller → Service → Repository)

Input validation with meaningful error responses

Global exception handling

Service-layer unit testing using Mockito

Dockerized application

Public cloud deployment

🧱 Architecture

Controller → Service → Repository → Database

Controller handles HTTP requests

Service contains business logic

Repository manages persistence using JPA

Database stores vehicle records

📌 API Endpoints
Create Vehicle

POST /api/vehicles

Request Body:

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
Get All Vehicles

GET /api/vehicles

Get Vehicle By ID

GET /api/vehicles/{id}

Update Vehicle

PUT /api/vehicles/{id}

Delete Vehicle

DELETE /api/vehicles/{id}

🧪 Validation & Error Handling

Invalid input returns structured error response:

{
"errors": {
"vin": "VIN cannot be empty",
"model": "Model cannot be empty"
},
"timestamp": "2026-02-28T18:28:47.8874171",
"status": 400
}
🧪 Testing

Run tests:

./mvnw test

Includes:

Unit tests for service layer (Mockito)

Validation testing

🚀 Run Locally

Build:

./mvnw clean install

Run:

java -jar target/fleetapi-0.0.1-SNAPSHOT.jar

Access locally:

http://localhost:8080/api/vehicles
🐳 Docker

Dockerfile included for containerized deployment.

Build image:

docker build -t fleetapi .

Run container:

docker run -p 8080:8080 fleetapi
🌍 Deployment

Deployed on Render using Docker.

Live API accessible at:

https://fleet-management-api-0oou.onrender.com

👩‍💻 Author

Amisha Sahu
Spring Boot Backend Project