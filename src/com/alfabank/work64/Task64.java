package com.alfabank.work64;

import java.util.Scanner;

public class Task64 {
    public static void main(String[] args) {
        int number = getNumber();
        String binaryNumber = convertDecimalToBinary(number);
        System.out.println(binaryNumber);
    }

     public static String convertDecimalToBinary(int number) {
        String result = " ";
        do {
            int digit = number % 2;
            result = digit + result;
            number /= 2;

        } while (number > 0);
        return result;
     }

    public static int getNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number -> ");
        while (true) {
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid value! Repeat!");
                scanner.next();
            } else {
                int number = scanner.nextInt();
                if (number > 0) {
                    return number;
                }
            }
        }
    }
}