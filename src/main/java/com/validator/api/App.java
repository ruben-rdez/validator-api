package com.validator.api;

import com.validator.api.handler.ValidatorHandler;
import com.validator.api.model.Request;

public class App {
    public static void main( String[] args ) {
        ValidatorHandler handler = new ValidatorHandler();

        Request validEmail = new Request("email", "user@example.com");
        System.out.println("Valid Email Validation Response: " 
            + handler.handleRequest(validEmail, null).getMessage());

        Request invalidEmail = new Request("email", "user@");
        System.out.println("Invalid Email Validation Response: " 
            + handler.handleRequest(invalidEmail, null).getMessage());

        Request validDate = new Request("date", "2025-06-16");
        System.out.println("Valid Date Validation Response: " 
            + handler.handleRequest(validDate, null).getMessage());

        Request invalidDate = new Request("date", "16-06-2025");
        System.out.println("Invalid Date Validation Response: " 
            + handler.handleRequest(invalidDate, null).getMessage());

        Request validPassword = new Request("password", "P@ssw0rd123");
        System.out.println("Valid Password Validation Response: "
            + handler.handleRequest(validPassword, null).getMessage());

        Request invalidPassword = new Request("password", "pass");
        System.out.println("Invalid Password Validation Response: "
            + handler.handleRequest(invalidPassword, null).getMessage());

        Request validMobile = new Request("mobile", "1234567890");
        System.out.println("Valid Mobile Validation Response: "
            + handler.handleRequest(validMobile, null).getMessage());

        Request invalidMobile = new Request("mobile", "12345");
        System.out.println("Invalid Mobile Validation Response: "
            + handler.handleRequest(invalidMobile, null).getMessage());                    
    }
}
