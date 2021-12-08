package com.step.smartMethods;

public class ArraySum {

    public int arraySum(int[] array){
        int sum = 0;
        for( int i: array ){  sum  += i;  }
        return sum;
    }

}
