package com.alfabank.work65;

import java.util.Scanner;

public class Task65 {
    public static void main(String[] args) {
        printPyramid( getNumber() );
    }

    public static void printPyramid(int height) {
        int level = 1;
        while (level <= height) {
            printSpace(height - level);
            printDigit(level);
            printDigit1(level - 1);
            level++;
            System.out.println();
        }
    }

    static void printSpace(int number) {
        int value = 0;
        while (value < number) {
            System.out.print(" ");
            value++;
        }
    }

    static void printDigit(int level) {
        int value = 1;
        while (value <= level) {
            System.out.print(value);
            value++;
        }
    }

    static void printDigit1(int level) {
        int value = level;
        while (value >= 1) {
            System.out.print(value);
            value--;
        }
    }

    public static int getNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number -> ");
        while (true) {
            if (!scanner.hasNextInt()) {
                scanner.next();
            } else {
                int number = scanner.nextInt();
                if (number > 0 && number < 10) {
                    return number;
                }
            }
            System.out.println("Invalid value! Repeat!");
        }
    }
}
