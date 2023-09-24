# Java-REST-API
# Task 1 
# Steps
# Defining the Server Entity:
Creating a Server class to represent the server objects. This class has fields like name, id, language, and framework. 

# Creating a MongoDB Configuration:
Creating a configuration class to connect to the MongoDB instance. We can specify the MongoDB host, port, and other settings in this class.

# Creating a Repository Interface:
Creating a repository interface for the Server entity. Spring Data MongoDB will provide basic CRUD operations.

# Creating a REST Controller:
Creating a REST controller class that defines the REST API endpoints for searching, creating, and deleting servers.

# Testing the Endpoints:
We can test the endpoints using Postman, curl, or any other HTTP client. Here are some example requests:

# DELETE a server by ID:
DELETE http://localhost:8080/servers/123
# GET servers by name:
GET http://localhost:8080/servers?name=centos
This example provides a basic implementation of the requested REST API using Spring Boot and MongoDB. We can extend it further to include error handling, validation, and additional features as needed.
