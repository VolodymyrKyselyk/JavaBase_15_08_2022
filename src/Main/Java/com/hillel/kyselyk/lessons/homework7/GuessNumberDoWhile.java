package com.hillel.kyselyk.lessons.homework7;

import java.util.Scanner;

public class GuessNumberDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess the number from 0 to 10.");
        int range = 11;
        int number = (int) (Math.random() * range);
        System.out.println(number);
        System.out.println("Your turn:");
        int yourNumber; int i = 1;
        do {
            if (sc.hasNextInt()) {
                yourNumber = sc.nextInt();
                if (yourNumber == number) {
                    System.out.println("You are winner!");
                    break;
                } else if (number > yourNumber) {
                    System.out.println("Your number is smaller.");
                } else {
                    System.out.println("Your number is bigger.");
                }
            } else {
                System.out.println("Wrong data, try again!");
            }
            sc.nextLine();
            i++;

        } while (i<=3);

    }

}

