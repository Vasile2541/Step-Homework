package com.step.smartMethods;

public class ReverseArray {
    public int[] reverseArray(int[] array) {
        int number = array.length;
        int[] reversedArray = new int[number];

        for (int i = 0; i < array.length; i++) {
            reversedArray[number - 1] = array[i];
            number--;
        }
        return reversedArray;
    }
}
//        for(int i=0; i< array.length/2; i++) {
//            int temp = array[i];
//            array[i] = array.length-n;
//            array.length-n = temp;
//            n++;
//        }
//         return array;


