package org.example;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter in the first side of the triangle");
        double side1 = getSideFromInput(input);

        System.out.println("Enter in the second side of the triangle");
        double side2 = getSideFromInput(input);

        System.out.println("Enter in the third side of the triangle");
        double side3 = getSideFromInput(input);

        System.out.println("Should the new Triangle be filled? Enter true or false");

        boolean trueFalse = getTrueFalseFromInput(input);

        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.setFilled(trueFalse);

        Triangle triangle1 = new Triangle();

        System.out.println(triangle);

        System.out.println(triangle.getSide1());
        System.out.println(triangle.getSide2());
        System.out.println(triangle.getSide3());


        String isFilledText = triangle.isFilled() ? "is " : "is not ";

        System.out.println("The new triangle " + isFilledText + "filled.");

        System.out.println("The triangles area is " + triangle.getArea());
        System.out.println("The triangles perimeter is " + triangle.getPerimeter());

        System.out.println("Making a triangle with the default constructor now:");

        System.out.println(triangle1);


    }

    public static double getSideFromInput(Scanner input) {

        double side;

        while (!input.hasNextDouble()) {
            System.out.println("Oops, must be a double, try again");
            input.next();
        };

        side = input.nextDouble();
        return side;

    }

    public static boolean getTrueFalseFromInput(Scanner input) {
        boolean trueFalse;

        while (!input.hasNextBoolean()) {
            System.out.println("oops, try again, must be a either true or false");
            input.next();
        }
        trueFalse = input.nextBoolean();

        return trueFalse;
    }
}