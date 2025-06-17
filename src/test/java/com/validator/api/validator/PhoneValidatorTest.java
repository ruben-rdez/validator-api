package com.validator.api.validator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneValidatorTest {

    @Test
    void testValidPhoneWithoutPlus() {
        assertTrue(PhoneValidator.isValidPhone("1234567890"));
    }

    @Test
    void testInvalidPhoneTooLong() {
        assertFalse(PhoneValidator.isValidPhone("+12345678901234567890"));
    }

    @Test
    void testInvalidPhoneWithLetters() {
        assertFalse(PhoneValidator.isValidPhone("+57300abc1234"));
    }

    @Test
    void testInvalidPhoneNull() {
        assertFalse(PhoneValidator.isValidPhone(null));
    }
}