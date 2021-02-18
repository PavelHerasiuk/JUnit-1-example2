package by.com.junit_test;

import by.com.junit.QuadraticEquation;
import org.junit.Assert;
import org.junit.Test;
/**
 * Unit test for simple App.
 */
public class TestQuadraticEquation {
    @Test
    public void quadraticEquation_validCoefficients_TwoRoots() {
        double[] expected = new double[]{-5, -1};
        double[] actual = QuadraticEquation.quadraticEquation(1, 6, 5);
        Assert.assertArrayEquals(expected, actual, 0);
    }

    @Test
    public void quadraticEquation_validCoefficients_OneRoots() {
        double[] expected = new double[]{0};
        double[] actual = QuadraticEquation.quadraticEquation(1, 0, 0);
        Assert.assertArrayEquals(expected, actual, 0);
    }

    @Test
    public void quadraticEquation_validCoefficients_NoRoots() {
        double[] expected = new double[]{0};
        double[] actual = QuadraticEquation.quadraticEquation(0, 1, 1);
        Assert.assertArrayEquals(expected, actual, 0);
    }
}
