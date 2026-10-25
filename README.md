# Employee Management System (EMS)

A backend web application for managing employee records using **Java, Spring Boot, Spring Security, and MySQL**.

---

## 📌 Project Overview

The Employee Management System (EMS) provides RESTful APIs for employee management, featuring JWT-based authentication and role-based access control.

The application follows a layered architecture to separate business logic, data access, and security responsibilities.

## 🚀 Features

- 🔐 **JWT Authentication** — Secure user authentication using JSON Web Tokens.
- 👥 **Role-Based Access Control** — Access control for Admin, Manager, and Employee roles.
- 📝 **Employee CRUD Operations** — Create, read, update, and delete employee records.
- 🔗 **RESTful APIs** — Structured endpoints for employee management.
- 📚 **API Documentation** — Swagger/OpenAPI integration.
- 🗄️ **Database Integration** — MySQL persistence using Spring Data JPA and Hibernate.
- ✅ **Validation & Exception Handling** — Request validation and application error handling.
- 🧱 **Layered Architecture** — Modular and maintainable code organization.

## 🛠️ Technologies Used

| Technology | Purpose |
|---|---|
| Java | Programming language |
| Spring Boot | Backend application framework |
| Spring Security | Authentication and authorization |
| JWT | Token-based authentication |
| Spring Data JPA | Data persistence |
| Hibernate | Object-relational mapping |
| MySQL | Relational database |
| Maven | Build and dependency management |
| Swagger / OpenAPI | API documentation |
| Postman | API testing |
| Git & GitHub | Version control |

## 🧱 Project Architecture

The application follows a layered architecture:

| Layer | Responsibility |
|---|---|
| **Controller** | Handles HTTP requests and responses |
| **Service** | Implements business logic |
| **Repository** | Manages database operations |
| **Entity** | Defines database models |
| **DTO** | Structures request and response data |
| **Security** | Handles authentication and authorization |

## 🔐 Authentication & Authorization

The application uses JWT-based authentication to protect secured API endpoints.

### Authentication Flow

1. The user submits login credentials.
2. A JWT is generated after successful authentication.
3. The client sends the token with requests to protected endpoints.
4. The application validates the token before granting access.

### User Roles

| Role | Access |
|---|---|
| **ADMIN** | Full access to authorized operations |
| **MANAGER** | Limited employee management operations |
| **EMPLOYEE** | Read-only access to permitted resources |

Authorization rules determine which resources and operations each role can access.
