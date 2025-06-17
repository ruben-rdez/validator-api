package com.validator.api.validator;

import java.util.regex.Pattern;

public class EmailValidator {

    private static final Pattern EMAIL_REGEX = Pattern.compile(
        "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,}$", Pattern.CASE_INSENSITIVE
    );

    public static boolean isValidEmail(String email) {
        if (email == null || email.isEmpty()) {
            return false;
        }
        return EMAIL_REGEX.matcher(email).matches();
    }

}
