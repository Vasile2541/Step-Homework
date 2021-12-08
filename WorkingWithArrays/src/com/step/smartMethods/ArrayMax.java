package com.step.smartMethods;

public class ArrayMax {
    public int arrayMax(int[] arr){
        int maxNumber = Integer.MIN_VALUE ;
        for (int i=0; i<arr.length; i++){
            if( arr[i] > maxNumber ) maxNumber = arr[i];
        }
        return maxNumber;
    }
}
