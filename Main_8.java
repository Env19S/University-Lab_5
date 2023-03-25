package org.example.task8;

import java.util.Scanner;

public class FastestAnimalsTask8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число от 1 до 8: ");
        int rank = scanner.nextInt();

        String animal;
        int speed;

        switch (rank) {
            case 1:
                animal = "Гепард";
                speed = 75;
                break;
            case 2:
                animal = "Антилопа";
                speed = 61;
                break;
            case 3:
                animal = "Лев";
                speed = 50;
                break;
            case 4:
                animal = "Койот";
                speed = 43;
                break;
            case 5:
                animal = "Страус";
                speed = 43;
                break;
            case 6:
                animal = "Заяц";
                speed = 40;
                break;
            case 7:
                animal = "Кенгуру";
                speed = 40;
                break;
            case 8:
                animal = "Черепаха";
                speed = 30;
                break;
            default:
                System.out.println("Неверное число. Введите число от 1 до 8.");
                return;
        }

        System.out.printf("Животное: %s, скорость: %d км/ч%n", animal, speed);
    }
}
