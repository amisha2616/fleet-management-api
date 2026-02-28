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


👩‍💻 Author
Amisha Sahu

