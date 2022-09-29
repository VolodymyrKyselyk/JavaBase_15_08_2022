package com.hillel.kyselyk.lessons.homework13;

public class Burger {
    String bun;
    String meat;
    int doubleMeat;
    String cheese;
    String greens;
    String mayonnaise;

    public Burger(){

    }
    //normal burger
    public Burger(String bun, String meat, String cheese, String greens, String mayonnaise) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
        System.out.println("Normal burger, all components are present.");
    }
    //diet burger
    public Burger(String bun, String meat, String cheese, String greens) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        System.out.println("Diet burger, without mayonnaise.");
    }
    //double meat

    public Burger(String bun, int doubleMeat, String cheese, String greens, String mayonnaise) {
        this.bun = bun;
        this.doubleMeat = doubleMeat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
        System.out.println("Double meat burger.");
    }
}
