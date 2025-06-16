# Validator API

A simple Java API for validating emails and dates.

## Project Structure

```
validator-api/
├── pom.xml
├── src/
│   ├── main/java/com/validator/api/
│   │   ├── App.java
│   │   ├── handler/ValidatorHandler.java
│   │   └── model/
│   │       ├── Request.java
│   │       └── Response.java
│   └── test/java/com/validator/api/AppTest.java
└── target/
```

## Build & Run

This project uses Maven for build automation.

### Build

```
mvn clean package
```

### Run

```
mvn exec:java -Dexec.mainClass="com.validator.api.App"
```

### Test

```
mvn test
```

## Description

- `App.java`: Main entry point of the application.
- `handler/ValidatorHandler.java`: Handles validation logic.
- `model/Request.java` & `model/Response.java`: Data models for requests and responses.

## Requirements
- Java 11 or higher
- Maven

## License

MIT License
