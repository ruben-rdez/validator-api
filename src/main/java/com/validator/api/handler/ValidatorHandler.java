package com.validator.api.handler;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.regex.Pattern;

import com.validator.api.model.Request;
import com.validator.api.model.Response;

public class ValidatorHandler implements RequestHandler<Request, Response>{

    private static final Pattern EMAIL_PATTERN =
    Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,}$", Pattern.CASE_INSENSITIVE);

    @Override
    public Response handleRequest(Request request, Context context) {
        try {
            if (request == null || request.getType() == null || request.getValue() == null) {
                return new Response(false, "Invalid Request", null);
            }

            String value = request.getValue().trim();

            if ("email".equalsIgnoreCase(request.getType())) {
                boolean isValid = EMAIL_PATTERN.matcher(value).matches();
                return new Response(isValid, isValid ? "Valid Email" : "Invalid Email", isValid);
            } else if ("date".equalsIgnoreCase(request.getType())) {
                DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                LocalDate date = LocalDate.parse(value, inputFormatter);
                DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                return new Response(true, "Formatted Date", date.format(outputFormatter));
            } else {
                return new Response(false, "Unsupported Type", null);
            }
        } catch (DateTimeParseException e) {
            return new Response(false, "Invalid Date Format. Expected: yyyy-MM-dd", null);
        } catch (Exception e) {
            return new Response(false, "Error processing request", null);
        }
    }
}
