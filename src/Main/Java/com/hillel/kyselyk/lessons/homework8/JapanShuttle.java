package com.hillel.kyselyk.lessons.homework8;

public class JapanShuttle {
    public static void main(String[] args) {
        int counter = 0;
        for (int i = 1; i < 156; i++) {
            if ((i / 10 == 4) | (i / 10 == 9) | (i % 10 == 4) | (i % 10 == 9) |(i==140)|(i==141)|(i==142)|(i==143)|(i==144)|(i==145)|(i==146)|(i==147)|(i==148)|(i==149)) {
                continue;
            }
            System.out.println(i);
            counter++;
        }
        System.out.println("Total numbers of shuttle: " + counter);

    }
}
