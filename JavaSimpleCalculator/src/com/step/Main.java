package com.step;

import com.step.calculator.Calculator;
import static java.lang.System.out;
public class Main {

    public static void main(String[] args) {
        int x = 17, y = 3;

        Calculator calculate = new Calculator();

        out.println("Add      "+x+" to "+y+" = "+calculate.add(x, y));
        out.println("Subtract "+x+" to "+y+" = "+calculate.subtract(x, y));
        out.println("Divide   "+x+" to "+y+" = "+calculate.divide(x, y));
        out.println("Multiply "+x+" to "+y+" = "+calculate.multiply(x, y));

    }
}
