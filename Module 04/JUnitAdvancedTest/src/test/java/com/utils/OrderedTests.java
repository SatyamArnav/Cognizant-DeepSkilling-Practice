package com.utils;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrderedTests {

    static StringBuilder tracker = new StringBuilder();

    @Test
    @Order(1)
    void stepOne() {
        tracker.append("A");
        assertTrue(true);
    }

    @Test
    @Order(2)
    void stepTwo() {
        tracker.append("B");
        assertEquals("AB", tracker.toString());
    }

    @Test
    @Order(3)
    void stepThree() {
        tracker.append("C");
        assertEquals("ABC", tracker.toString());
    }
}
