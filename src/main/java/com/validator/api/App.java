package com.validator.api;

import com.validator.api.handler.ValidatorHandler;
import com.validator.api.model.Request;
import com.validator.api.model.Response;

public class App {
    public static void main( String[] args ) {
        ValidatorHandler handler = new ValidatorHandler();

        Request request = new Request("email", "user@example.com");
        Response response = handler.handleRequest(request, null);
        System.out.println("Email Validation Response: " + response.getMessage());

        Request invalidEmail = new Request("email", "user@");
        System.out.println("Invalid Email Validation Response: " 
            + handler.handleRequest(invalidEmail, null).getMessage());

        Request dateRequest = new Request("date", "2025-06-16");
        System.out.println("Valid Date Validation Response: " 
            + handler.handleRequest(dateRequest, null).getMessage());

        Request invalidDate = new Request("date", "16-06-2025");
        System.out.println("Invalid Date Validation Response: " 
            + handler.handleRequest(invalidDate, null).getMessage());
    }
}
