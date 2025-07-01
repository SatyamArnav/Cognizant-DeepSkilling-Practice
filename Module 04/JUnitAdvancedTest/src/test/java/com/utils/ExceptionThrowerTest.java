package com.utils;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ExceptionThrowerTest {

    @Test
    void testThrowsForNegative() {
        ExceptionThrower et = new ExceptionThrower();
        assertThrows(IllegalArgumentException.class, () -> et.throwIfNegative(-1));
    }

    @Test
    void testDoesNotThrowForPositive() {
        ExceptionThrower et = new ExceptionThrower();
        assertDoesNotThrow(() -> et.throwIfNegative(10));
    }
}
