package com.hillel.kyselyk.lessons.homework6;

import java.util.Scanner;

public class CounterStrike {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int player1 = 0;
        int player2 = 0;
        int player3 = 0;
        int player4 = 0;
        int player5 = 0;
        System.out.println("Please enter Team 1 name!");
        String teamName1 = sc.nextLine();
        System.out.println("Please input one by one scores of players' " + teamName1);
        if (sc.hasNextInt()) {
            player1 = sc.nextInt();
            System.out.println("Frag player1 = " + player1);
        } else {
            System.out.println("Unfortunately, you had inputted wrong data. Please try again!");
            System.exit(0);
        }
        if (sc.hasNextInt()) {
            player2 = sc.nextInt();
            System.out.println("Frag player2 = " + player2);
        } else {
            System.out.println("Unfortunately, you had inputted wrong data. Please try again!");
            System.exit(0);
        }
        if (sc.hasNextInt()) {
            player3 = sc.nextInt();
            System.out.println("Frag player3 = " + player3);
        } else {
            System.out.println("Unfortunately, you had inputted wrong data. Please try again!");
            System.exit(0);
        }
        if (sc.hasNextInt()) {
            player4 = sc.nextInt();
            System.out.println("Frag player4 = " + player4);
        } else {
            System.out.println("Unfortunately, you had inputted wrong data. Please try again!");
            System.exit(0);
        }
        if (sc.hasNextInt()) {
            player5 = sc.nextInt();
            System.out.println("Frag player5 = " + player5);
        } else {
            System.out.println("Unfortunately, you had inputted wrong data. Please try again!");
            System.exit(0);
        }
        System.out.println("Please enter Team 2 name!");
        sc.nextLine();

        String teamName2 = sc.nextLine();
        if (teamName1.equals(teamName2)){
            System.out.println("Unfortunately, teams can't have the same name. Please try again!" );
            System.exit(0);
        } else{
            System.out.println("Please input one by one scores of players' " +teamName2);
        }
        int gamer1 = 0;
        int gamer2 = 0;
        int gamer3 = 0;
        int gamer4 = 0;
        int gamer5 = 0;
        if (sc.hasNextInt()) {
            gamer1 = sc.nextInt();
            System.out.println("Frag player1 = " + gamer1);
        } else {
            System.out.println("Unfortunately, you had inputted wrong data. Please try again!");
            System.exit(0);
        }
        if (sc.hasNextInt()) {
            gamer2 = sc.nextInt();
            System.out.println("Frag player2 = " + gamer2);
        } else {
            System.out.println("Unfortunately, you had inputted wrong data. Please try again!");
            System.exit(0);
        }
        if (sc.hasNextInt()) {
            gamer3 = sc.nextInt();
            System.out.println("Frag player3 = " + gamer3);
        } else {
            System.out.println("Unfortunately, you had inputted wrong data. Please try again!");
            System.exit(0);
        }
        if (sc.hasNextInt()) {
            gamer4 = sc.nextInt();
            System.out.println("Frag player4 = " + gamer4);
        } else {
            System.out.println("Unfortunately, you had inputted wrong data. Please try again!");
            System.exit(0);
        }
        if (sc.hasNextInt()) {
            gamer5 = sc.nextInt();
            System.out.println("Frag player5 = " + gamer5);
        } else {
            System.out.println("Unfortunately, you had inputted wrong data. Please try again!");
            System.exit(0);
        }
        double result1 = ((double) player1+player2+player3+player4+player5)/5;
        double result2 = ((double)gamer1+gamer2+gamer3+gamer4+gamer5)/5;
        if (result1>result2){
            System.out.println("The winner is " +teamName1+ ", who scored "+result1+" points.");
        } else if (result1<result2){
            System.out.println("The winner is " +teamName2+ ", who scored "+result2+" points.");
        } else if (result1==result2){
            System.out.println("Dead heat, scores of both teams are "+result1+".");
        }
        sc.close();

        }


    }


