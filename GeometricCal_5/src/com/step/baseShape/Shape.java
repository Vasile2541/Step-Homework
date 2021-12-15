package com.step.baseShape;

public abstract   class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        System.out.print("Color for this Shape  is: ");
        return color;
    }

    public abstract double area();

    public abstract double perimeter();

}
