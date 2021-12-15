package com.step;
import com.step.baseShape.Shape;
import com.step.menu.ShowMenu;
import com.step.shapes.*;

import java.util.Scanner;


public class GeometricCalculator {

    public static void main(String[] args) {
        Scanner scanner    = new Scanner(System.in);
        ShowMenu show      = new ShowMenu();
        Shape[] shapeArray = new Shape[5];

        int iterator  = 0;
        boolean check = true;
        while (check) {

            show.showMenu();
            int x = scanner.nextInt();

            switch (x) {
                case 1:
                    System.out.print("Enter side length for Square: ");
                    double length = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.print("Enter color for Square: ");
                    String color = scanner.nextLine();

                    shapeArray[iterator] = new Square( length, color );
                    iterator++;

                    break;

                case 2:
                    System.out.print("Enter length for Rectangle: ");
                    length = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.print("Enter width  for Rectangle: ");
                    double width = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.print("Enter color  for Rectangle: ");
                    color = scanner.nextLine();

                    shapeArray[iterator] = new Rectangle( length, width, color );
                    iterator++;

                    break;

                case 3:
                    System.out.print("Enter Radius for Circle: ");
                    double radius = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.print("Enter Color  for Circle: ");
                    color = scanner.nextLine();

                    shapeArray[iterator] = new Circle( radius, color );
                    iterator++;

                    break;

                case 4:
                    check = false;
                    for ( int j=0; j < iterator; j++ ){
                        System.out.println( shapeArray[j].area()      );
                        System.out.println( shapeArray[j].perimeter() );
                        System.out.println( shapeArray[j].getColor()  );
                        System.out.println();
                    }
                    break;

            }

        }

    }

}
