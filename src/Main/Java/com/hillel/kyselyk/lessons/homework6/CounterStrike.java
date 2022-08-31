package com.hillel.kyselyk.lessons.homework6;

import java.util.Scanner;

public class CounterStrike {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter Team 1 name!");
        String teamName1 = sc.nextLine();
        System.out.println("Please input one by one scores of players' " + teamName1);

        if (sc.hasNextInt()) {
            int player1 = sc.nextInt();
            System.out.println("Frag player1 = " + player1);
        } else {
            System.out.println("Unfortunately, you had inputted wrong data. Please try again!");
            System.exit(0);
        }
        if (sc.hasNextInt()) {
            int player2 = sc.nextInt();
            System.out.println("Frag player2 = " + player2);
        } else {
            System.out.println("Unfortunately, you had inputted wrong data. Please try again!");
            System.exit(0);
        }
        if (sc.hasNextInt()) {
            int player3 = sc.nextInt();
            System.out.println("Frag player3 = " + player3);
        } else {
            System.out.println("Unfortunately, you had inputted wrong data. Please try again!");
            System.exit(0);
        }
        if (sc.hasNextInt()) {
            int player4 = sc.nextInt();
            System.out.println("Frag player4 = " + player4);
        } else {
            System.out.println("Unfortunately, you had inputted wrong data. Please try again!");
            System.exit(0);
        }
        if (sc.hasNextInt()) {
            int player5 = sc.nextInt();
            System.out.println("Frag player5 = " + player5);
        } else {
            System.out.println("Unfortunately, you had inputted wrong data. Please try again!");
            System.exit(0);
        }
        System.out.println("Please enter Team 2 name!");
        sc.nextLine();
        String teamName2 = sc.nextLine();
        System.out.println("Please input one by one scores of players' " + teamName2);

        if (sc.hasNextInt()) {
            int gamer1 = sc.nextInt();
            System.out.println("Frag player1 = " + gamer1);
        } else {
            System.out.println("Unfortunately, you had inputted wrong data. Please try again!");
            System.exit(0);
        }
        if (sc.hasNextInt()) {
            int gamer2 = sc.nextInt();
            System.out.println("Frag player2 = " + gamer2);
        } else {
            System.out.println("Unfortunately, you had inputted wrong data. Please try again!");
            System.exit(0);
        }
        if (sc.hasNextInt()) {
            int gamer3 = sc.nextInt();
            System.out.println("Frag player3 = " + gamer3);
        } else {
            System.out.println("Unfortunately, you had inputted wrong data. Please try again!");
            System.exit(0);
        }
        if (sc.hasNextInt()) {
            int gamer4 = sc.nextInt();
            System.out.println("Frag player4 = " + gamer4);
        } else {
            System.out.println("Unfortunately, you had inputted wrong data. Please try again!");
            System.exit(0);
        }
        if (sc.hasNextInt()) {
            int gamer5 = sc.nextInt();
            System.out.println("Frag player5 = " + gamer5);
        } else {
            System.out.println("Unfortunately, you had inputted wrong data. Please try again!");
            System.exit(0);
        }
        double result1 = (player1+player2+player3+player4+player5)/5;
        double result2 = (gamer1+gamer2+gamer3+gamer4+gamer5)/5;
        if (result1>result2){
            System.out.println("The winner is " + teamName1+ "scored"+result1+"points");
        } else if (result1<result2){
            System.out.println("The winner is " +teamName2+ "scored"+result2+"points");
        } else {
            System.out.println("Dead heat");
        }

        }


    }


