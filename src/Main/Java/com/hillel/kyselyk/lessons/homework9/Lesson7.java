package com.hillel.kyselyk.lessons.homework9;

import java.util.Arrays;

public class Lesson7 {
    public static void main(String[] args) {
//        int[] array1 = new int[3];
//        array1[0]=23;
//        array1[1]=-1;
//        array1[2]=67;
//        System.out.println(array1[0]);
//        System.out.println(array1[1]);
//        System.out.println(array1[2]);
//        System.out.println();
//        System.out.println(array1.length);


//        int array2[]=new int[3];
//
//        int[]array2 = {23,-1,67,33,77,89,1};
//        array2[-1]=99;
//        System.out.println(array2[0]);
//        System.out.println(array2[1]);
//        System.out.println(array2[2]);
//        int[] array = new int[10];

//        for (int i = 0; i < array.length; i++) {
//            array[i]=i;
//        }
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i]+" ");
//        }
//        System.out.println();
//        System.out.println(Arrays.toString(array));

//        for (int value:array) {
//            System.out.println(value);
//        int[] array = new int[10];
//        for (int i = 0; i < array.length; i++) {
//            array[i]=(int)(Math.random()*11);
//        }
//        System.out.println(Arrays.toString(array));
//        for (int i = 0; i < array.length-1; i++) {
//            System.out.print(array[i]+", ");
//        }
//        System.out.println(array[array.length-1]);

//        System.out.println(Arrays.toString(array));
//        for (int i = 0; i < array.length; i++) {
//            if(i<array.length-1) {
//                System.out.print(array[i] + ",");
//            }else{
//                System.out.print(array[i]);
//            }

//        }
        //Kennedy
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i]=(int)(Math.random()*101);
        }
        System.out.println(Arrays.toString(array));

//        int max = array[0];
//        int index = 0;
//        for (int i = 0; i <array.length ; i++) {
//            if(array[i]>max){
//                max=array[i];
//                index = i;
//

        int max = -1;
        for (int value: array) {
            if(value>max){
                max=value;

            }
        }
        System.out.println(" chance "+max);





        //basketball
//        int[]team=new int[10];
//        for (int i = 0; i < team.length; i++) {
//            team[i]=(int)(Math.random()*16);
//
//        }
//        System.out.println(Arrays.toString(team));
//        int sumMain = 0;
//        int sumReserve = 0;
//        for (int i = 0; i < team.length; i++) {
//            if (i%2==0){
//                sumMain+=team[i];
//            }else{
//                sumReserve+=team[i];
//            }
//        }
//        System.out.println("main = "+sumMain);
//        System.out.println("reserved = "+sumReserve);
//        if (sumMain==sumReserve){
//            System.out.println("Draw");
//        } else if (sumMain > sumReserve){
//            System.out.println("team Main scored " +(sumMain-sumReserve)+" points more then team Reserved ");
//        } else {
//                System.out.println("team Main scored " +(sumReserve-sumMain)+" points more then team Reserved ");
//        }


    }

}

