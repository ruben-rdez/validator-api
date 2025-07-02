# Validator API

A Java API for validating emails, dates, passwords, and mobile numbers.

## Project Structure

```
validator-api/
├── pom.xml
├── src/
│   ├── main/java/com/validator/api/
│   │   ├── App.java
│   │   ├── handler/ValidatorHandler.java
│   │   ├── model/
│   │   │   ├── Request.java
│   │   │   └── Response.java
│   │   └── validations/
│   │       ├── EmailValidator.java
│   │       ├── DateValidator.java
│   │       ├── PasswordValidator.java
│   │       └── MobileValidator.java
│   └── test/java/com/validator/api/AppTest.java
└── target/
```

## Features
- **Email Validation**: Checks if an email address is valid.
- **Date Validation**: Validates date strings in `yyyy-MM-dd` format.
- **Password Validation**: Ensures passwords are at least 8 characters, with upper/lowercase, digit, and special character.
- **Mobile Validation**: Validates 10-digit mobile numbers not starting with 0.

## Build & Run

This project uses Maven for build automation.

### Build
```sh
mvn clean package
```

### Run
```sh
mvn exec:java -Dexec.mainClass="com.validator.api.App"
```

### Test
```sh
mvn test
```

## Main Classes
- `App.java`: Example usage and entry point.
- `handler/ValidatorHandler.java`: Handles validation requests.
- `model/Request.java` & `model/Response.java`: Data models.
- `validations/EmailValidator.java`: Email validation logic.
- `validations/DateValidator.java`: Date validation logic.
- `validations/PasswordValidator.java`: Password validation logic.
- `validations/MobileValidator.java`: Mobile number validation logic.

## Requirements
- Java 21
- Maven

## License
jrubenrm License
