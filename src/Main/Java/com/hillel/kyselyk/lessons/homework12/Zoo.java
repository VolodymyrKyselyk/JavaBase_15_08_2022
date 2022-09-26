package com.hillel.kyselyk.lessons.homework12;

public class Zoo {
    static final double COEFFICIENT_BEARS = 1.3;
    static final double COEFFICIENT_TIGERS = 1.2;
    static final double COEFFICIENT_PARROTS = 1.4;
    static final double COEFFICIENT_ELEPHANTS = 1.05;
    static final double COEFFICIENT_RACCOONS = 1.8;
    static final double COEFFICIENT_LAMAS = 1.05;
    public static void main(String[] args) {
        int min = 2;
        int max = 30;

        int bears = getRandomNumber(min,max);
        int tigers = getRandomNumber(min,max);
        int parrots = getRandomNumber(min,max);
        int elephants = getRandomNumber(min,max);
        int raccoons = getRandomNumber(min,max);
        int lamas = getRandomNumber(min,max);




        printCount("bears",bears);
        printCount("tigers",tigers);
        printCount("parrots",parrots);
        printCount("elephants",elephants);
        printCount("raccoons",raccoons);
        printCount("lamas",lamas);

        System.out.println("count animals current year = "+countAnimals(bears,tigers,parrots,elephants,raccoons));
        System.out.println("count animals next year = "+countAnimalsNextYear(bears,tigers,parrots,elephants,raccoons));
        System.out.println();
        System.out.println("count animals current year = "+countAnimals(bears,tigers,parrots,elephants,raccoons,lamas));
        System.out.println("count animals next year = "+countAnimalsNextYear(bears,tigers,parrots,elephants,raccoons,lamas));
    }
    static int getRandomNumber (int min, int max){
        return min + (int) (Math.random() * ((max - min) + 1));
    }
    static void printCount (String animal,int count){
        System.out.println(animal+ "="+count);
    }
    static int countAnimals(int bears, int tigers, int parrots, int elephants, int raccoons){
        return bears+tigers+parrots+elephants+raccoons;
    }
    static int countAnimals(int bears, int tigers, int parrots, int elephants, int raccoons, int lamas){
        return bears+tigers+parrots+elephants+raccoons+lamas;
    }
    static int countAnimalsNextYear(int bears, int tigers, int parrots, int elephants, int raccoons){
        return (int)(bears*COEFFICIENT_BEARS)
                +(int) (tigers*COEFFICIENT_TIGERS)
                + (int)(parrots*COEFFICIENT_PARROTS)
                + (int)(elephants*COEFFICIENT_ELEPHANTS )
                + (int)(raccoons*COEFFICIENT_RACCOONS);
    }
    static int countAnimalsNextYear(int bears, int tigers, int parrots, int elephants, int raccoons, int lamas){
        return (int)(bears*COEFFICIENT_BEARS)
                +(int) (tigers*COEFFICIENT_TIGERS)
                + (int)(parrots*COEFFICIENT_PARROTS)
                + (int)(elephants*COEFFICIENT_ELEPHANTS )
                + (int)(raccoons*COEFFICIENT_RACCOONS)
                + (int)(lamas*COEFFICIENT_LAMAS);
    }

}
