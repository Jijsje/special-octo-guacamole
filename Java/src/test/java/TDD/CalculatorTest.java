package TDD;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testAdd_noInput() {
        Calculator calc = new Calculator();
        assertEquals(0, calc.add(null));
    }

    @Test
    void testAdd_inputUpTo2Numbers() {
        Calculator calc = new Calculator();
        assertEquals(1, calc.add("1"));
        assertEquals(3, calc.add("1 2"));
    }

    @Test
    void testAdd_inputManyNumbers() {
        Calculator calc = new Calculator();
        assertEquals(125, calc.add("4 7 3 8 12 76 3 5 7"));
        assertEquals(3150, calc.add("9 0 3123 4 6 8"));
    }

    @Test
    void testAdd_newLinesAllowed() {
        Calculator calc = new Calculator();
        assertEquals(22, calc.add("4 5 6 \n 7"));
    }

    @Test
    void testAdd_delimiters() {
        Calculator calc = new Calculator();
        assertEquals(22, calc.add("-4-5-6-\n-7"));
        assertEquals(22, calc.add(";4;5;6;\n;7"));
    }

    @Test
    void testAdd_negatives() {
        Calculator calc = new Calculator();
        assertEquals(8, calc.add(" 4 5 6 \n -7"));
        assertEquals(8, calc.add("'4'5'6'\n'-7"));
        // in mijn code zijn negatieve getallen lekker wel toegestaan :)
    }
}