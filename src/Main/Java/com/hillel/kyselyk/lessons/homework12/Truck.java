package com.hillel.kyselyk.lessons.homework12;

public class Truck {
    public static void main(String[] args) {
        int length = 2, width = 3, height = 4;
        int volume = countVolume(length, width, height);
        System.out.println(volume);
    }


    static int countVolume (int length, int width, int height){

//        int volume = length*width*height;
//        return  volume;
        return length*width*height;
    }
}
