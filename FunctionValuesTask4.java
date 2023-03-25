package org.example;

public class FunctionValuesTask4 {

    public static void main(String[] args) {
        double[] testValues = {-4, -3, 2, 3, 4};

        for (double x : testValues) {
            System.out.printf("x = %.1f, y = %.6f%n", x, calculateFunction(x));
        }
    }

    private static double calculateFunction(double x) {
        if (x < -3) {
            return Math.tan(x);
        } else if (x > -3 && x < 3) {
            return 1 / Math.tan(x); // ctg(x)
        } else if (x > 3) {
            return (Math.sqrt(Math.abs(4 - x))) / 2 + Math.pow(x, 2);
        } else { // x = -3 or x = 3
            return Math.PI;
        }
    }
}
