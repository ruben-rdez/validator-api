package com.validator.api.validations;

public class DateValidator {

    public static boolean isValidDate(String date) {
        if (date == null || date.isEmpty()) {
            return false;
        }
        try {
            java.time.LocalDate.parse(date, java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            return true;
        } catch (java.time.format.DateTimeParseException e) {
            return false;
        }
    }

}
