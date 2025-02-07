# swiftCodeRequitmentToRemitly

## Overview
This project implements a RESTful API for managing SWIFT codes. SWIFT codes, also known as Bank Identifier Codes (BIC), uniquely identify banks and their branches worldwide. The application parses SWIFT data from a provided file, stores it in a database, and exposes it via RESTful endpoints.

## Features
- Parses and processes SWIFT code data from a file.
- Stores the data in a non-relational database (MongoDB).
- Provides a REST API for querying and managing SWIFT codes.
- Supports retrieval of individual SWIFT codes, country-specific SWIFT codes, adding new entries, and deleting entries.
- Ensures fast and low-latency querying.
- Handles edge cases with informative error messages.

## Technologies Used
- **Programming Language:** Java
- **Framework:** Spring Boot
- **Database:** MongoDB
- **Build Tool:** Maven

## Setup and Installation
### Prerequisites
- Java 21
- Maven 
- MongoDB
- Git

### Installation Steps
1. Clone the repository:
   ```sh
   git clone https://github.com/your-repository-url.git
   cd your-repository
   ```
2. Build the project:
   ```sh
   mvn clean install
   ```
3. Run the application:
   ```sh
   mvn spring-boot:run
   ```

## API Endpoints
### Retrieve a single SWIFT code
**GET /v1/swift-codes/{swift-code}**

### Retrieve SWIFT codes for a country
**GET /v1/swift-codes/country/{countryISO2code}**

### Add a new SWIFT code
**POST /v1/swift-codes**

Request:
```json
{
    "address": "string",
    "bankName": "string",
    "countryISO2": "string",
    "countryName": "string",
    "isHeadquarter": true,
    "swiftCode": "string"
}
```

### Delete a SWIFT code
**DELETE /v1/swift-codes/{swift-code}**

