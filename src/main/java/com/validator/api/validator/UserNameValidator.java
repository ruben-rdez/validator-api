package com.validator.api.validator;

public class UserNameValidator {

    private static final String USERNAME_PATTERN = "^\\w{2,20}$";

    private UserNameValidator() {
        // Private constructor to prevent instantiation
        throw new UnsupportedOperationException("UserNameValidator is a utility class and cannot be instantiated");
    }

    public static boolean isValidUserName(String userName) {
        if (userName == null || userName.trim().isEmpty()) {
            return false;
        }

        return userName.matches(USERNAME_PATTERN);
    }

}
