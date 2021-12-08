package com.step.getArray;

import java.util.Scanner;

public class GetIntArray {
    private Scanner scanner = new Scanner(System.in);

    public int[] getIntArray(int number){
        int arr[] = new int[number];
        System.out.println("Enter "+number+" numbers!");

        for (int i=0; i<arr.length; i++){
            arr[i]= scanner.nextInt();
        }
         return arr;
    }
}
