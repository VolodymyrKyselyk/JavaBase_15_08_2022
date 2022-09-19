package com.hillel.kyselyk.lessons.homework11;

import java.util.Scanner;

public class MatrixTransposition {
    public static void main(String[] args) {
        //variables for Math.random;
        int max = 9;
        int min = 0;
        //array variables;
        int M = 0;
        int N = 0;
        //enter array length;
        System.out.println("Enter array length:");
        Scanner scanner = new Scanner(System.in);
        do {
            if (scanner.hasNextInt()) {
                M = scanner.nextInt();
                if (M >= 0) {
                    break;
                } else {
                    System.out.println("Please enter positive or even number.");
                }

            } else {
                System.out.println("Please enter positive or even number.");
                scanner.nextLine();
            }
        } while (true);
        //enter array width;
        System.out.println("Enter array width:");
        do {
            if (scanner.hasNextInt()) {
                N = scanner.nextInt();
                if (N >= 0) {
                    break;
                } else {
                    System.out.println("Please enter positive or even number.");
                }

            } else {
                System.out.println("Please enter positive or even number.");
                scanner.nextLine();
            }
        } while (true);
        // actions with matrix : creating and transposition;
        if (M != N) {
            System.out.println("Wrong data! To do Matrix Transposition, length should be equal to width! Try again!");
        } else {
            System.out.println("MxN matrix:");
            int[][] array = new int[M][N];
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    array[i][j] = (min + (int) (Math.random() * ((max - min) + 1)));
                    System.out.print(array[i][j] + "\t");
                }
                System.out.println();
            }
            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array[i].length; j++) {
                    int temp = array[i][j];
                    array[i][j] = array[j][i];
                    array[j][i] = temp;
                }
            }
            System.out.println("NxM matrix:");
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    System.out.print(array[i][j] + "\t");
                }
                System.out.println();
            }
        }

    }
}
