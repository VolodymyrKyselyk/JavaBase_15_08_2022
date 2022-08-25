package com.hillel.kyselyk.lessons.homework5;

public class ChinaDynasty {
    public static void main(String[] args) {
        int warriorLi = 13;
        int archerLi  = 24;
        int riderLi   = 46;

        int warriorMin = 9;
        int archerMin  = 35;
        int riderMin   = 12;

        double amountLi = 860;
        double amountMin = amountLi * 1.5;

        System.out.println("Indicator of the army Li = " + amountLi*(warriorLi+archerLi+riderLi));
        System.out.println("Indicator of the army Min = " + amountMin*(warriorMin+archerMin+riderMin));
    }
}
