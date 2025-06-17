package com.validator.api.validator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {

    @Test
    void testValidPassword() {
        assertTrue(PasswordValidator.isValidPassword("ValidPass123@"));
    }

    @Test
    void testPasswordTooShort() {
        assertFalse(PasswordValidator.isValidPassword("Pass1"));
    }

    @Test
    void testPasswordMissingUpperCase() {
        assertFalse(PasswordValidator.isValidPassword("password123"));
    }

    @Test
    void testPasswordMissingLowerCase() {
        assertFalse(PasswordValidator.isValidPassword("PASSWORD123"));
    }

    @Test
    void testPasswordMissingDigit() {
        assertFalse(PasswordValidator.isValidPassword("NoDigitsHere"));
    }
}