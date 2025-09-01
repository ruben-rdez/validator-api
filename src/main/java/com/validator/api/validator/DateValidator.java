package com.validator.api.validator;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;

public class DateValidator {

    private DateValidator() {
        // Private constructor to prevent instantiation
        throw new UnsupportedOperationException("DateValidator is a utility class and cannot be instantiated");
    }

    private static final DateTimeFormatter DATE_FORMATTER = 
        DateTimeFormatter.ofPattern("uuuu-MM-dd").withResolverStyle(ResolverStyle.STRICT);

    public static boolean isValidDate(String date) {
        if (date == null || date.isEmpty()) {
            return false;
        }

        try {
            LocalDate.parse(date, DATE_FORMATTER);
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }

}
