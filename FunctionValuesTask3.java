package org.example;

public class FunctionValuesTask3 {

    public static void main(String[] args) {
        double start = -3;
        double end = 3;
        double step = 0.5;

        for (double x = start; x <= end; x += step) {
            System.out.printf("x = %.1f, f(x) = %.6f%n", x, calculateFunction(x));
        }
    }

    private static double calculateFunction(double x) {
        if (x >= 0) {
            return Math.exp(x) - 5 * x;
        } else {
            return 2 * Math.sin(x) * Math.cos(x);
        }
    }
}