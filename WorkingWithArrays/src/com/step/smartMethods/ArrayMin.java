package com.step.smartMethods;

public class ArrayMin {
    public int arrayMin(int[] arr){
        int minNumber = Integer.MAX_VALUE ;
        for (int i=0; i<arr.length; i++){
            if( arr[i] < minNumber ) minNumber = arr[i];
        }
        return minNumber;
    }
}
