package com.validator.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.validator.api.handler.ValidatorHandler;
import com.validator.api.model.Request;

public class App {
    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main( String[] args ) {
        ValidatorHandler handler = new ValidatorHandler();

        Request validEmail = new Request("email", "user@example.com");
        logger.info("Valid Email Validation Response: {}", 
            handler.handleRequest(validEmail, null).getMessage());

        Request invalidEmail = new Request("email", "user@");
        logger.info("Invalid Email Validation Response: {}", 
            handler.handleRequest(invalidEmail, null).getMessage());

        Request validDate = new Request("date", "2025-06-16");
        logger.info("Valid Date Validation Response: {}", 
            handler.handleRequest(validDate, null).getMessage());

        Request invalidDate = new Request("date", "2023-02-30");
        logger.info("Invalid Date Validation Response: {}", 
            handler.handleRequest(invalidDate, null).getMessage());

        Request validPassword = new Request("password", "P@ssw0rd123");
        logger.info("Valid Password Validation Response: {}", 
            handler.handleRequest(validPassword, null).getMessage());

        Request invalidPassword = new Request("password", "pass");
        logger.info("Invalid Password Validation Response: {}", 
            handler.handleRequest(invalidPassword, null).getMessage());

        Request validMobile = new Request("phone", "1234567890");
        logger.info("Valid Mobile Validation Response: {}", 
            handler.handleRequest(validMobile, null).getMessage());

        Request invalidMobile = new Request("phone", "12345");
        logger.info("Invalid Mobile Validation Response: {}", 
            handler.handleRequest(invalidMobile, null).getMessage());
    }
}
