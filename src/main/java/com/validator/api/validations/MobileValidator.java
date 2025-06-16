package com.validator.api.validations;

public class MobileValidator {

    public static boolean isValidMobile(String mobile) {
        if (mobile == null || mobile.length() != 10) {
            return false;
        }

        for (char c : mobile.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }

        return mobile.charAt(0) != '0';
    }
}
