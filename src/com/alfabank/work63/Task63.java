package com.alfabank.work63;

import java.util.Scanner;

public class Task63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text -> ");
        String str = sc.nextLine();

        System.out.print("Enter number word -> ");
        int number = sc.nextInt();

        System.out.println(getFirstCharacterOfWorld(str, number) );
    }

    public static char getFirstCharacterOfWorld(String str, int numberWord) {

        str = str.trim();

        if (numberWord == 1) {
            return str.charAt(0);
        }

        int position = 0;
        int counterWords = 1;
        while ((position = str.indexOf( ' ', position)) != -1) {
            counterWords++;
            if (counterWords  == numberWord) {
                return str.charAt(position + 1);
            }
            position++;
        }

        return '\u0000';
    }
}
