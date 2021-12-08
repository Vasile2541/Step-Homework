package com.step.smartMethods;

public class FindLetter {
    public void findLetter(char[] array){
        char upperChar;
        for( int i=0; i<array.length; i++ ) {
            switch ( Character.toUpperCase(array[i]) ) {
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    System.out.println(array[i] + " - Vowel");
                    break;
                default:
                    System.out.println(array[i] + " - Consonant");
            }
        }
    }

}
