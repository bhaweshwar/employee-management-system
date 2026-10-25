Employee Management System (EMS)

📌 Project Overview

The Employee Management System (EMS) is a backend web application designed to manage employee records securely and efficiently. It provides RESTful APIs for employee management, with JWT-based authentication and role-based access control.

The project demonstrates backend development using Java, Spring Boot, Spring Security, and MySQL, following a modular, layered architecture.

🚀 Features

🔐 JWT Authentication — Secure authentication using JSON Web Tokens.

👥 Role-Based Access Control — Access management for Admin, Manager, and Employee roles.

📝 Employee CRUD Operations — Create, read, update, and delete employee records.

🔗 RESTful APIs — Structured endpoints for employee management.

📚 API Documentation — API documentation using Swagger/OpenAPI.

🗄️ Database Integration — Persistent data storage using Spring Data JPA and MySQL.

✅ Validation & Exception Handling — Structured handling of invalid requests and application errors.

🧩 Layered Architecture — Modular organization for maintainability and scalability.

🛠️ Technology Stack

Category

Technologies

Language

Java

Framework

Spring Boot

Security

Spring Security, JWT

ORM & Persistence

Hibernate, Spring Data JPA

Database

MySQL

Build Tool

Maven

API Documentation

Swagger / OpenAPI

API Testing

Postman

Version Control

Git, GitHub

🧱 Project Architecture

The application follows a layered architecture, separating responsibilities into distinct layers.

Layer

Responsibility

Controller Layer

Handles incoming HTTP requests and generates responses.

Service Layer

Implements business logic and application workflows.

Repository Layer

Manages database access and persistence operations.

Entity Layer

Defines the application's database models.

DTO Layer

Structures request and response data transfer objects.

Security Layer

Handles JWT authentication and authorization.

This separation helps keep the code organized, maintainable, and easier to extend.

🔐 Authentication & Authorization

The application uses JSON Web Tokens (JWT) to authenticate users and protect secured endpoints.

Authentication Flow

A user submits their login credentials.

Upon successful authentication, a JWT is generated.

The client includes the token when accessing protected endpoints.

The application validates the token before granting access to secured resources.

User Roles

Role

Access Level

ADMIN

Full access to authorized employee management operations.

MANAGER

Limited employee management permissions.

EMPLOYEE

Read-only access to permitted resources.

Access to endpoints is controlled according to the user's assigned role.
