package com.hillel.kyselyk.lessons.homework10;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class lesson8 {
    public static void main(String[] args) {
//       Integer []array = {10,2,55,-1,0,88,-22,65,34,12,1};
//
//        int temp;
//        for (int i = 0; i < array.length-1 ; i++) {
//            for (int j = 0; j < array.length-1; j++) {
//                if(array[j]>array[j+1]){
//                    temp=array[j];
//                    array[j]=array[j+1];
//                    array[j+1]=temp;
//                }
//
//            }
//        }
//        System.out.println(Arrays.toString(array));
//        Arrays.sort(array);
//        System.out.println(Arrays.toString(array));
//        int []array = {10,2,55,-1,0,88,-22,65,34,12,1};
//        int[] array2 = array;
//        System.out.println(Arrays.toString(array));
//        System.out.println(Arrays.toString(array2));
//        array2[0]=99;
//        System.out.println(Arrays.toString(array));
//        System.out.println(Arrays.toString(array2));
//        int[]array2 = Arrays.copyOf(array,array.length+10);
//        int[]array3 = Arrays.copyOfRange(array, (array.length/2), array.length+10);

//        int[]array2=new int[array.length];
//        System.arraycopy(array, 0, array2,5,array.length-5);
//
//        System.out.println(Arrays.toString(array));
//        System.out.println(Arrays.toString(array2));
//        array2[0]=99;
//        System.out.println();
//        System.out.println(Arrays.toString(array));
//        System.out.println(Arrays.toString(array2));
       int N = -1;
        System.out.println("Enter array length:");

        Scanner scanner = new Scanner(System.in);
        do{
        if (scanner.hasNextInt()){
            N=scanner.nextInt();
            if(N%2==0&&N>=0){
                break;
            }else{
                System.out.println("please enter positive number and %2 ==0");
            }

        }else{
            System.out.println("Wrong data, try again");
            scanner.nextLine();
        }
        }while(true);
        int[]array=new int[N];

        for (int i = 0; i < array.length; i++) {
            array[i]=(int)(Math.random()*26);
        }
        System.out.println(Arrays.toString(array));

//        int[]array2 = Arrays.copyOf(array,array.length+10);
//        int[]array3 = Arrays.copyOfRange(array, (array.length/2), array.length+10);
        int middle = array.length/2;
        int[]array1=Arrays.copyOf(array,middle);
        int[]array2=Arrays.copyOfRange(array, middle,array.length);

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        Arrays.sort(array1);

    }


}
