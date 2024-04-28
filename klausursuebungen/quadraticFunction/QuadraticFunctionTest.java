package de.thws.klausursuebungen.quadraticFunction;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class QuadraticFunctionTest {

    @Test
    public void testRoots() {
        QuadraticFunction equation1 = new QuadraticFunction(1, -3, 2);
        assertArrayEquals(new double[]{1, 2}, equation1.roots());

        QuadraticFunction equation2 = new QuadraticFunction(1, -4, 4);
        assertArrayEquals(new double[]{1, 2}, equation2.roots());

        QuadraticFunction equation3 = new QuadraticFunction(2, 3, 4);
        assertArrayEquals(new double[]{1, 2}, equation3.roots());
    }
    // Die "expected" Werte und die Nachkommastellen werden ignoriert.
}
