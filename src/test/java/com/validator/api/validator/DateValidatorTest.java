package com.validator.api.validator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DateValidatorTest {

    @Test
    public void testInvalidDateValue() {
        String date = "2023-02-30"; 
        assertFalse(DateValidator.isValidDate(date), "The date value should be invalid.");
    }

    @Test
    public void testValidDateValue() {
        String date = "2023-02-28";
        assertTrue(DateValidator.isValidDate(date), "The date value should be valid.");
    }

    @Test
    public void testNullDateValue() {
        String date = null;
        assertFalse(DateValidator.isValidDate(date), "The date value should be invalid when null.");
    }

    @Test
    public void testEmptyDateValue() {
        String date = "";
        assertFalse(DateValidator.isValidDate(date), "The date value should be invalid when empty.");
    }

}
