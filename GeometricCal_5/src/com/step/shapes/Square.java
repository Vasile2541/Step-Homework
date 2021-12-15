package com.step.shapes;
import com.step.baseShape.Shape;

public class Square extends Shape {
   private double length;

   public Square( double length, String color ) {
        super( color );
        this.length = length;
   }

   public double area(){
       System.out.print("Area       of SQUARE is: ");
       return 4 * length;
   }

   public double perimeter(){
        System.out.print("Perimeter of SQUARE is: ");
        return length * length;
   }

}
