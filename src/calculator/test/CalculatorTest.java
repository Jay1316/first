package calculator.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import calculator.model.Calculator;

class CalculatorTest {
    @Test
    void testAddition() {
        Calculator cal = new Calculator();

        // test 2 positive numbers
        assertEquals(cal.getAnswer(5, 5, '+'), 10);

        // test 1 positive and 1 negative
        assertEquals(cal.getAnswer(-5, 5, '+'), 0);
        assertEquals(cal.getAnswer(5, -10, '+'), -5);

        // test 2 negative numbers
        assertEquals(cal.getAnswer(-1, -1, '+'), -2);
    }

    @Test
    void testSubtraction() {
        Calculator cal = new Calculator();

        // test 2 positive numbers
        assertEquals(cal.getAnswer(5, 5, '-'), 0);

        // test 1 positive and 1 negative
        assertEquals(cal.getAnswer(-5, 5, '-'), -10);
        assertEquals(cal.getAnswer(5, -10, '-'), 15);

        // test 2 negative numbers
        assertEquals(cal.getAnswer(-1, -1, '-'), 0);
    }

    @Test
    void testMultiplication() {
        Calculator cal = new Calculator();

        // test 2 positive numbers
        assertEquals(cal.getAnswer(5, 5, '*'), 25);

        // test 1 positive and 1 negative
        assertEquals(cal.getAnswer(-5, 5, '*'), -25);
        assertEquals(cal.getAnswer(5, -10, '*'), -50);

        // test 2 negative numbers
        assertEquals(cal.getAnswer(-1, -1, '*'), 1);
    }

    @Test
    void testDivision() {
        Calculator cal = new Calculator();

        // test 2 positive numbers
        assertEquals(cal.getAnswer(5, 5, '/'), 1);

        // test 1 positive and 1 negative
        assertEquals(cal.getAnswer(-5, 5, '/'), -1);
        assertEquals(cal.getAnswer(5, -10, '/'), -0.5);

        // test 2 negative numbers
        assertEquals(cal.getAnswer(-1, -1, '/'), 1);
    }
}
