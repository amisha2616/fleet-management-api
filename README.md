# 🚗 Fleet Management API

A production-ready Spring Boot microservice for managing vehicle records.

This project demonstrates REST API development, layered architecture, validation, exception handling, unit testing, Dockerization, and cloud deployment.

---

## 🔥 Live Demo

**Base URL**  
https://fleet-management-api-0oou.onrender.com

**Example Endpoint**  
POST `/api/vehicles`

---

## 🛠 Tech Stack

- Java 17  
- Spring Boot 3.2.5  
- Spring Data JPA  
- H2 (configurable for PostgreSQL)  
- Jakarta Validation  
- JUnit 5 & Mockito  
- Docker  
- Render (Cloud Deployment)

---

## 📦 Features

- RESTful CRUD APIs  
- Layered architecture (Controller → Service → Repository)  
- Input validation with structured error responses  
- Global exception handling  
- Service-layer unit testing using Mockito  
- Dockerized application  
- Public cloud deployment  

---

## 🧱 Architecture

Controller → Service → Repository → Database  

- **Controller** handles HTTP requests  
- **Service** contains business logic  
- **Repository** manages persistence using JPA  
- **Database** stores vehicle records  

---

## 📌 API Endpoints

### Create Vehicle

POST `/api/vehicles`

**Request Body**

```json
{
  "vin": "VIN12345",
  "model": "Tesla Model 3",
  "firmwareVersion": "v1.0.0",
  "lastServiceDate": "2026-02-28"
}
