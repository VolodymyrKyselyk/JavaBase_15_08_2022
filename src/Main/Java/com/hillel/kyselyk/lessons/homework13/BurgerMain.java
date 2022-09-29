package com.hillel.kyselyk.lessons.homework13;

public class BurgerMain {
    public static void main(String[] args) {
        Burger burger = new Burger();
        burger.bun = "Bun";
        burger.cheese = "Cheese";
        burger.meat = "Meat";
        burger.doubleMeat = 2;
        burger.greens="Greens";
        burger.mayonnaise="Mayonnaise";

        System.out.println("Normal burger: "+burger.bun+", "+ burger.meat+", "+burger.cheese+", "+burger.greens+", "+burger.mayonnaise+".");
        System.out.println("Diet burger: "+burger.bun+", "+ burger.meat+", "+burger.cheese+", "+burger.greens+".");
        System.out.println("Double meat burger: "+burger.bun+", "+ burger.doubleMeat+" Meat"+", "+burger.cheese+", "+burger.greens+", "+burger.mayonnaise+".");

    }


}
