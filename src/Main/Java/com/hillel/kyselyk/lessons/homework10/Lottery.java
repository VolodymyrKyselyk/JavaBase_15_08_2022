package com.hillel.kyselyk.lessons.homework10;


import java.util.Arrays;

public class Lottery {
    public static void main(String[] args) {
        //counting of numbers;
        final int COUNTER_OF_NUMBERS = 7;
        //arrays initialization;
        int[] coNo = new int[COUNTER_OF_NUMBERS];
        int[] plNo = new int[COUNTER_OF_NUMBERS];
        //variables for Math.random;
        int max = 9;
        int min = 0;
        //creating Company's numbers;
        System.out.println("Company's numbers:");
        for (int i = 0; i < coNo.length; i++) {
            coNo[i] = (min + (int) (Math.random() * ((max - min) + 1)));
        }
        Arrays.sort(coNo);
        System.out.println(Arrays.toString(coNo) + ".");
        //creating Player's numbers;
        System.out.println("Player's numbers:");
        for (int i = 0; i < plNo.length; i++) {
            plNo[i] = (min + (int) (Math.random() * ((max - min) + 1)));
        }
        Arrays.sort(plNo);
        System.out.println(Arrays.toString(plNo) + ".");
        //definition amount of the same numbers
        System.out.println("Amount of the same numbers: ");
        int a = 0;
        for (int i = 0; i < coNo.length; i++) {
            if (coNo[i] == plNo[i]) {
                a++;
            }
        }
        System.out.println(a);
        if (a == 0) {
            System.out.println("Game over!");
        }
        //definition of the matched indexes
        System.out.println("Matched indexes: ");
        for (int i = 0; i < coNo.length; i++) {
            if (coNo[i] == plNo[i]) {
                System.out.print(i + " ");
            }
        }

    }

}



