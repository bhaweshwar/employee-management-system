Employee Management System (EMS)
📌 Project Overview

The Employee Management System (EMS) is a backend web application designed to manage employee records securely and efficiently. It provides RESTful APIs for employee operations with JWT-based authentication and role-based access control.

This project demonstrates backend development skills using Java, Spring Boot, Spring Security, and MySQL, following industry-standard layered architecture.

🚀 Features

Secure authentication using JWT (JSON Web Tokens)

Role-based access control (Admin, Manager, Employee)

Create, Read, Update, Delete (CRUD) operations for employees

RESTful API design

API documentation using Swagger/OpenAPI

Database integration using Spring Data JPA & MySQL

Exception handling and validation

Modular and scalable project structure

🛠️ Technologies Used

Language: Java

Framework: Spring Boot

Security: Spring Security, JWT

ORM: Hibernate, Spring Data JPA

Database: MySQL

Build Tool: Maven

API Documentation: Swagger / OpenAPI

Testing Tool: Postman

Version Control: Git & GitHub

🧱 Project Architecture

The application follows a layered architecture:

Controller Layer: Handles HTTP requests and responses

Service Layer: Contains business logic

Repository Layer: Handles database operations

Entity Layer: Defines database models

DTO Layer: Manages request and response objects

Security Layer: JWT authentication and authorization

🔐 Authentication & Authorization

User authentication is handled using JWT tokens

Token is generated on successful login

Secured endpoints require a valid JWT token

Role-based authorization ensures restricted access:

ADMIN: Full access

MANAGER: Limited management operations

EMPLOYEE: Read-only access
