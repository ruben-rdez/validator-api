package com.validator.api.validator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailValidatorTest {

    @Test
    void testValidEmail() {
        assertTrue(EmailValidator.isValidEmail("test@example.com"));
    }

    @Test
    void testInvalidEmailMissingAt() {
        assertFalse(EmailValidator.isValidEmail("testexample.com"));
    }

    @Test
    void testInvalidEmailEmpty() {
        assertFalse(EmailValidator.isValidEmail(""));
    }

    @Test
    void testInvalidEmailNull() {
        assertFalse(EmailValidator.isValidEmail(null));
    }
}