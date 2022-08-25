package com.hillel.kyselyk.lessons.homework3;

public class Volume {
    public static void main(String[] args) {
        int a = 20;
        int b = 30;
        int h = 15;
        int volume = a*b*h;
        int length = 4*(a+b+h);
        System.out.println("The volume of the parallelepiped = "+volume);
        System.out.println("The length of all sides = "+length);
    }
}
