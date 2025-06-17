package com.validator.api.validator;

public class PhoneValidator {

    public static boolean isValidPhone(String phone) {
        if (phone == null || phone.length() != 10) {
            return false;
        }

        for (char c : phone.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }

        return phone.charAt(0) != '0';
    }
}
