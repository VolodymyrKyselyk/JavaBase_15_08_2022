package com.hillel.kyselyk.lessons.homework9;

import java.util.Arrays;

public class Rugby {
    public static void main(String[] args) {
        // counting of players:
        final int COUNT_PLAYERS = 25;
        // initialization of arrays for both teams:
        int[] teamAlpha = new int[COUNT_PLAYERS];
        int[] teamBravo = new int[COUNT_PLAYERS];
        // minimum age of player:
        int min = 18;
        // maximum age of player:
        int max = 40;
        //variables for total age calculation:
        double sumAgeAlpha = 0;
        double sumAgeBravo = 0;

        // Team Alpha:
        for (int i = 0; i < teamAlpha.length; i++) {
            teamAlpha[i] = (min + (int) (Math.random() * ((max - min) + 1)));
            sumAgeAlpha = sumAgeAlpha + teamAlpha[i];
        }
        System.out.println("Team Alpha players' age:");
        System.out.println(Arrays.toString(teamAlpha) + ".");
        System.out.println("Average age of team Alpha = " + (int) (sumAgeAlpha) / teamAlpha.length + ".");

        //Team Bravo:
        for (int i = 0; i < teamBravo.length; i++) {
            teamBravo[i] = (min + (int) (Math.random() * ((max - min) + 1)));
            sumAgeBravo = sumAgeBravo + teamBravo[i];
        }
        System.out.println("Team Bravo players' age:");
        System.out.println(Arrays.toString(teamBravo) + ".");
        System.out.println("Average age of team Bravo = " + (int) (sumAgeBravo) / teamBravo.length + ".");

        // age comparison:
        int a = (int) (sumAgeAlpha) / teamAlpha.length;
        int b = (int) (sumAgeBravo) / teamBravo.length;
        if (a > b) {
            System.out.println("Average age of team \"Alpha\" bigger than average age of team \"Bravo\".");
        } else if (a < b) {
            System.out.println("Average age of team \"Bravo\" bigger than average age of team \"Alpha\".");
        } else {
            System.out.println("Average age are the same!");
        }

    }



}
