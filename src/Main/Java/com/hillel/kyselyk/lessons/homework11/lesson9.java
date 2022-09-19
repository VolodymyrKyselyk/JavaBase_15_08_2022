package com.hillel.kyselyk.lessons.homework11;

import java.util.Arrays;

public class lesson9 {
    public static void main(String[] args) {
//        int[][] array = new int [5][3];

//        array[0][0]=77;
//        array[2][4]=11;
//        System.out.println(array.length);
//        System.out.println(array[0].length);
//        System.out.println(Arrays.toString(array[0]));
//        System.out.println(Arrays.toString(array[1]));
//        System.out.println(Arrays.toString(array[2]));

//        int counter = 1;
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                array[i][j]=counter;
//                counter++;
//            }
//        }
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(Arrays.toString(array[i]));
//        }
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j]+"\t");
//            }
//            System.out.println();
//        }
//
//
//
//        int[][]array2={
//                {1},
//                {20,21},
//                {30,31,32,33,34},
//                {40,41,42},
//                {},
//                {99,98,97,98},
//        };
//        System.out.println(array2.length);
//        System.out.println(array2[0].length);
//        System.out.println(array2[1].length);
//        System.out.println(array2[2].length);
//        System.out.println(array2[3].length);
//        System.out.println(array2[4].length);
//        System.out.println(array2[5].length);
//        System.out.println();
//
//        for (int i = 0; i < array2.length; i++) {
//            System.out.println(Arrays.toString(array2[i]));
//        }
//        for (int i = 0; i < array2.length; i++) {
//            for (int j = 0; j < array2[i].length; j++) {
//                System.out.print(array2[i][j]+"\t");
//            }
//            System.out.println();
//        }

//        int [][]array = new int[5][5];
//        int counter =0;
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                counter++;
//                if(i==j){
//                    array[i][j]=1;
//                }
//            }
//        }
//        System.out.println(counter);
//        int[][] array = new int[5][5];
//        int counter = 0;
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                array[i][i] = 1;
//            }
//
//        }
//        System.out.println(counter);
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                if(i+j== array.length-1){
//                    array[i][j]=1;
//                }
//            }
//        }
//        for (int i = 0, j=array.length-1; i < array.length; i++, j--) {
//                if(i+j== array.length-1){
//                    array[i][j]=1;
//                }
//
//        }
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j] + "\t");
//            }
//            System.out.println();
//        }
//
//        char[][]array = new char[8][8];
//
//        for (int i = 0; i <array.length; i++) {
//            for (int j = 0; j < array.length; j++) {
//                if((i+j)%2==0){
//                    array[i][j]='B';
//                }else{
//                    array[i][j]='W';
//                }
//                array[i][j]=((i+j)%2==0)?'B':'W';
//            }
//        }
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j] + "\t");
//            }
//            System.out.println();
//        }


//      Matrix Transposition

        int [][] array = new int [4][4];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j]=(int)(Math.random()*101);
            }
        }
        System.out.println("Before");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array[i].length; j++) {
               int temp = array [i][j];
               array [i][j]=array[j][i];
               array[j][i]=temp;
            }
        }
        System.out.println("After");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }



    }
}

