package com.example;



import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calc = new Calculator(2, 3);
        assertEquals(5, calc.add());
    }

    @Test
    public void testSubtract() {
        Calculator calc = new Calculator(5, 3);
        assertEquals(2, calc.subtract());
    }

    @Test
    public void testGettersAndSetters() {
        Calculator calc = new Calculator();
        calc.setValue1(10);
        calc.setValue2(5);

        assertEquals(10, calc.getValue1());
        assertEquals(5, calc.getValue2());
    }

    @Test
    public void testIsEven() {
        assertTrue(Calculator.isEven(2));
        assertFalse(Calculator.isEven(3));
        assertTrue(Calculator.isEven(100));
        assertFalse(Calculator.isEven(99));
    }

    @Test
    public void testValidRange() {
        assertThrows(IllegalArgumentException.class, () -> Calculator.isEven(0));
        assertThrows(IllegalArgumentException.class, () -> Calculator.isEven(101));
    }
}
