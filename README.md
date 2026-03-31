# Internship Platform Backend

## Description

This project is a backend application for an internship platform. It allows managing internship offers through a REST API.

The objective is to build a clean and scalable backend using Spring Boot, connected to a PostgreSQL database, as a foundation for a future full-stack application.

## Objectives

- Build a REST API to manage internship offers
- Learn and practice Spring Boot and JPA
- Connect a Java backend to a PostgreSQL database
- Structure a clean backend project

## Technologies

- Java 17
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Maven

## Database

The project uses PostgreSQL.

You need to create the database manually before running the application:

CREATE DATABASE internship_platform;

## Configuration

Update the file:

src/main/resources/application.properties

Example configuration:

spring.datasource.url=jdbc:postgresql://localhost:5434/internship_platform
spring.datasource.username=postgres
spring.datasource.password=postgres

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.open-in-view=false

Make sure the port (5434) matches your PostgreSQL configuration.

## Run the project

Using IntelliJ:
- Run the main class: InternshipPlatformBackendApplication

Using terminal:

./mvnw spring-boot:run

The application will start on:

http://localhost:8080

## API

Example endpoint:

GET http://localhost:8080/api/offers

This endpoint returns the list of internship offers stored in the database.

## Current Features

- InternshipOffer entity
- PostgreSQL database connection
- Automatic table creation with JPA
- Basic REST endpoint to retrieve data

## Next Steps

- Add POST endpoint to create offers
- Add filters (city, technology)
- Add validation
- Connect a React frontend

## Author

Youra Ahmed
