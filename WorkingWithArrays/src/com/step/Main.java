package com.step;

import com.step.getArray.*;
import com.step.showArray.ShowCharArray;
import com.step.showArray.ShowIntArray;
import com.step.smartMethods.*;

public class Main {
    public static void main(String[] args) {

        try {
            GetIntArray getIntArray = new GetIntArray();
            int[] intArray  = getIntArray.getIntArray(6);

            System.out.println("Inserted Array: ");
            ShowIntArray showArray = new ShowIntArray();
            showArray.showIntArray( intArray );

            System.out.print("Sum of array is: ");
            ArraySum arraySum = new ArraySum();
            int x = arraySum.arraySum(intArray);
            System.out.println(x);

            System.out.print("Reversed array is: ");
            ReverseArray reverseArray = new ReverseArray();
            int[] reversedArray = reverseArray.reverseArray(intArray);
            showArray.showIntArray( reversedArray );

            System.out.print("Max Number from above array: ");
            ArrayMax arrayMax = new ArrayMax();
            int maxNumber = arrayMax.arrayMax(intArray);
            System.out.println( maxNumber );

            System.out.print("Min Number from above array: ");
            ArrayMin arrayMin = new ArrayMin();
            int minNumber = arrayMin.arrayMin(intArray);
            System.out.println( minNumber );

            System.out.println("");
            System.out.print("Enter char: ");
            GetCharArray objArrayChar = new GetCharArray();
            char charArray[] = objArrayChar.getCharArray(6);
            ShowCharArray showCharArray = new ShowCharArray();
            showCharArray.showCharArray(charArray);

            FindLetter findLetter = new FindLetter();
            findLetter.findLetter(charArray);

        }
       catch (Exception e){
           System.out.println("Enter corresponding data type!");
       }

    }

}
