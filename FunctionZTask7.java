package org.example;

import java.util.Scanner;

public class FunctionZTask7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение x: ");
        double x = scanner.nextDouble();

        if (x >= -4 && x <= 4) {
            double z;
            if (x < 0) {
                z = 3 * x + Math.sqrt(1 + Math.pow(x, 2));
            } else if (x >= 0 && x <= 1) {
                z = 2 * Math.cos(x) * Math.exp(-2 * x);
            } else {
                z = 2 * Math.sin(3 * x);
            }
            System.out.println("Значение функции z = " + z);
        } else {
            System.out.println("x не удовлетворяет интервалу определения функции: х∈[-4,4].");
        }
    }
}
