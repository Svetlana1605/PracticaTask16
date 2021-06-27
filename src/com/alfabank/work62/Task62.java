package com.alfabank.work62;

import java.util.Scanner;

public class Task62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter number -> ");
        int number = sc.nextInt();

        String result = latestDigit(number);
        System.out.println(result);

    }

    public static String latestDigit (int number) {
        if (Math.abs(number) < 10) {
            return String.valueOf(number);
        }
        number = Math.abs(number) % 100;
        String res = String.valueOf(number);

        return "" + res.charAt(1) +res.charAt(0);
    }


}
