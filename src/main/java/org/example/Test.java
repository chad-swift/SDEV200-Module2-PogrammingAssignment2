package org.example;

import java.util.Scanner;

// Triangle class definition and tester
// Triangle class inherits GeometricObject,
// creates Triangles, and prints information to the screen
// Chad Swift
// SDEV200-50P
// Module 1 Assignment 3

/**
 * Test class to test Triangle class
 */
public class Test {
    public static void main(String[] args) {

        // create new Scanner
        Scanner input = new Scanner(System.in);

        // get side1
        System.out.println("Enter in the first side of the triangle");
        double side1 = getSideFromInput(input);

        // get side2
        System.out.println("Enter in the second side of the triangle");
        double side2 = getSideFromInput(input);

        // get side2
        System.out.println("Enter in the third side of the triangle");
        double side3 = getSideFromInput(input);

        // Ask a question for the filled property
        System.out.println("Should the new Triangle be filled? Enter true or false");
        boolean trueFalse = getTrueFalseFromInput(input);

        // create new triangle with the previously found attributes
        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.setFilled(trueFalse);

        // test toString method
        System.out.println(triangle);

        // testing getters, not required by the book, just making sure code works as intended
        System.out.println(triangle.getSide1());
        System.out.println(triangle.getSide2());
        System.out.println(triangle.getSide3());

        // message displaying if the triangle is filled or not
        System.out.println("Is the new triangle filled? ");
        System.out.println(triangle.isFilled());

        // message displaying if the triangle's area
        System.out.println("The triangles area is " + triangle.getArea());
        // message displaying if the triangle's perimeter
        System.out.println("The triangles perimeter is " + triangle.getPerimeter());

        // not required by the book, but I wanted to test the default constructor
        Triangle triangle1 = new Triangle();
        System.out.println("Making a triangle with the default constructor now:");

        System.out.println(triangle1);


    }

    /**
     * @param input takes in the scanner
     * @return a double representing a side of a triangle
     */
    public static double getSideFromInput(Scanner input) {

        double side;

        // while there is no next double in input, loop
        while (!input.hasNextDouble()) {
            System.out.println("Oops, must be a double, try again");
            // clear buffer
            input.next();
        }

        // set side to the next double
        side = input.nextDouble();
        // return it
        return side;

    }


    /**
     * @param input takes in a scanner
     * @return boolean based on the input given
     */
    public static boolean getTrueFalseFromInput(Scanner input) {
        boolean trueFalse;

        // same as before, if Scanner does not have a nextBoolean, loop
        while (!input.hasNextBoolean()) {
            System.out.println("oops, try again, must be a either true or false");
            // clear out buffer
            input.next();
        }
        // set variable to next boolean
        trueFalse = input.nextBoolean();
        // return it
        return trueFalse;
    }
}