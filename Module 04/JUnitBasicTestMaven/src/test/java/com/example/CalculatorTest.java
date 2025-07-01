package com.example;

import static org.junit.Assert.*;
import org.junit.*;

public class CalculatorTest {

    private Calculator calc;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("Before all tests");
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        System.out.println("After all tests");
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("Before each test");
        calc = new Calculator();
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("After each test");
        calc = null;
    }

    @Test
    public void testAdd() {
        int result = calc.add(2, 3); 
        assertEquals(5, result);   
    }

    @Test
    public void testSubtract() {
        int result = calc.subtract(5, 3);
        assertEquals(2, result);        
    }
}
