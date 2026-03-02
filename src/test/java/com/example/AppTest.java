package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testAdd() {
        App calculator = new App();
        assertEquals(15, calculator.add(10, 5));
    }

    @Test
    public void testSubtract() {
        App calculator = new App();
        assertEquals(5, calculator.subtract(10, 5));
    }

    @Test
    public void testMultiply() {
        App calculator = new App();
        assertEquals(50, calculator.multiply(10, 5));
    }

    @Test
    public void testDivide() {
        App calculator = new App();
        assertEquals(2, calculator.divide(10, 5));
    }
}
