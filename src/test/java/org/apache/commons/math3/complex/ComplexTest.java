package org.apache.commons.math3.complex;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;

public class ComplexTest {

    @Test
    public void divide() {
        Complex complex1 = new Complex(1.0, 2.0);
        Complex complex2 = new Complex(0.0, 0.0);

        Complex result = complex1.divide(complex2);

        assertTrue(result.isNaN());
    }

    @Test
    public void testEquals() {
        Complex complex1 = new Complex(1.0, 2.0);
        Complex complex2 = new Complex(1.0, 2.0);

        boolean result = complex1.equals(complex2);
        assertTrue(complex1.equals(complex2));
    }

    @Test
    public void multiply() {
        Complex complex1 = new Complex(2.0, 3.0);
        Complex complex2 = new Complex(4.0, 5.0);

        Complex result = complex1.multiply(complex2);

        assertEquals(-7.0, result.getReal());
        assertEquals(22.0, result.getImaginary());
    }
}