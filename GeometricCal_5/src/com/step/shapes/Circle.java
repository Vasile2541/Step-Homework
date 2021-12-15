package com.step.shapes;

import com.step.baseShape.Shape;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius, String color) {
        super( color );
        this.radius = radius;
    }


    public double area(){
        System.out.print("Area      of CIRCLE is: ");
        return Math.PI * radius * radius;
    }

    public double perimeter(){
        System.out.print("Perimeter of CIRCLE is: ");
        return Math.PI * 2 * radius;
    }

}
