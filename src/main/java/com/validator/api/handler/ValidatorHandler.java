package com.validator.api.handler;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import java.time.format.DateTimeParseException;

import com.validator.api.model.Request;
import com.validator.api.model.Response;
import com.validator.api.validations.PasswordValidator;
import com.validator.api.validations.MobileValidator;
import com.validator.api.validations.EmailValidator;
import com.validator.api.validations.DateValidator;

public class ValidatorHandler implements RequestHandler<Request, Response>{

    @Override
    public Response handleRequest(Request request, Context context) {
        try {
            switch (request.getType().toLowerCase()) {
                case "email":
                    boolean emailValid = EmailValidator.isValidEmail(request.getValue());
                    return new Response(emailValid, emailValid ? "Valid Email" : "Invalid Email", emailValid);
                case "date":
                    boolean dateValid = DateValidator.isValidDate(request.getValue());
                    return new Response(dateValid, dateValid ? "Valid Date" : "Invalid Date", dateValid);
                case "password":
                    boolean passwordValid = PasswordValidator.isValidPassword(request.getValue());
                    return new Response(passwordValid, passwordValid ? "Valid Password" : "Invalid Password", passwordValid);
                case "mobile":
                    boolean mobileValid = MobileValidator.isValidMobile(request.getValue());
                    return new Response(mobileValid, mobileValid ? "Valid Mobile Number" : "Invalid Mobile Number", mobileValid);
                default:
                    return new Response(false, "Unsupported Type", null);
            }
        } catch (DateTimeParseException e) {
            return new Response(false, "Invalid Date Format", null);
        } catch (Exception e) {
            return new Response(false, "Error Processing Request", null);
        }

    }
}
