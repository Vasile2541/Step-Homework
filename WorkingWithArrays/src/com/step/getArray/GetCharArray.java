package com.step.getArray;

import java.util.Scanner;

public class GetCharArray {
    private Scanner scanner = new Scanner(System.in);

    public char[] getCharArray(int number){
        char arr[] = new char[number];
        System.out.println("Enter "+number+" chars!");

        int i;
        char c;
        for ( i=0; i<arr.length; i++){
            c = scanner.next().charAt(0);
            //daca caracterul introdus este de valoare numerica
            // verificam dac (char == 0->9) => reintroducem un caracter
            for(int j=0; j<10; j++){
                if ( Character.getNumericValue( c ) == j ){
                    System.out.println("Enter a char Type!");
                    i--;
                    break;

                }else{
                    arr[i] = c;
                }

            }

        }
        return arr;
    }
}
