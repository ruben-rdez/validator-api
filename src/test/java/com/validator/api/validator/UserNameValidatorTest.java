package com.validator.api.validator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserNameValidatorTest {

    @Test
    void testValidUserName() {
        String userName = "validUser123";
        assertTrue(UserNameValidator.isValidUserName(userName), "The username should be valid.");
    }

    @Test
    void testInvalidUserNameTooShort() {
        String userName = "u";
        assertFalse(UserNameValidator.isValidUserName(userName), "The username should be invalid.");
    }


}
