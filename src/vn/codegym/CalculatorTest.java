package vn.codegym;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void show() {
        System.out.println(">>> run test;");
        Calculator c = new Calculator();
        c.show();
    }
    @Test
    void test1(){
        Calculator c = new Calculator();
        int kq = c.calculate(4,6,'*');
        assertEquals(24,kq);
    }

    @Test
    @DisplayName("Testing addition")
    void testCalculateAdd() {
        int a = 1;
        int b = 1;
        char o = '+';
        int expected = 5;

        int result = Calculator.calculate(a, b, o);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing subtraction")
    void testCalculateSub() {
        int a = 2;
        int b = 1;
        char o = '-';
        int expected = 1;

        int result = Calculator.calculate(a, b, o);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing multiplication")
    void testCalculateMul() {
        int a = 2;
        int b = 2;
        char o = '*';
        int expected = 4;

        int result = Calculator.calculate(a, b, o);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing division")
    void testCalculateDiv() {
        int a = 6;
        int b = 3;
        char o = '/';
        int expected = 2;

        int result = Calculator.calculate(a, b, o);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing division by zero")
    void testCalculateDivByZero() {
        int a = 2;
        int b = 0;
        char o = '/';

        assertThrows(RuntimeException.class,
                ()-> {Calculator.calculate(a, b, o);});
    }

    @Test
    @DisplayName("Testing wrong operator")
    void testCalculateWrongOperator() {
        int a = 2;
        int b = 0;
        char o = '=';

        assertThrows(RuntimeException.class,
                ()-> {Calculator.calculate(a, b, o);});
    }
}
