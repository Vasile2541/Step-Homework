package com.step.shapes;
import com.step.baseShape.Shape;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width, String color) {
        super( color );
        this.length = length;
        this.width = width;
    }

    public double area(){
        System.out.print("Area      of RECTANGLE is: ");
        return length*width;
    }

    public double perimeter(){
        System.out.print("Perimeter of RECTANGLE is: ");
        return 2*(length + width);
    }

}
