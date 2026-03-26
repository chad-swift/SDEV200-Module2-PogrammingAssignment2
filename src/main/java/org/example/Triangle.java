package org.example;

/**
 * Class that creates a triangle. Inherits from Geometric Object
 */
public class Triangle extends GeometricObject {
    // variables
    private final double side1;
    private final double side2;
    private final double side3;

    // default constructor makes the defaults
    Triangle() {
        side1 = 1.0;
        side2 = 1.0;
        side3 = 1.0;
    }

    /**
     * @param side1 first side of a triangle
     * @param side2 second side of a triangle
     * @param side3 third side of a triangle
     */
    Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    /**
     * @return area represented by a double
     */
    // override tag for good practice
    @Override
    public double getArea() {
        // Get the semi-perimeter
        double s = (side1 + side2 + side3)/2;

        // apply Heron's formula
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    /**
     * @return perimeter represented by a double
     */
    // override tag for good practice
    @Override
    public double getPerimeter() {
        // simply add all the sides together
        return side1 + side2 + side3;
    }

    // getters
    public double getSide1() {
        return this.side1;
    }

    public double getSide2() {
        return this.side2;
    }

    public double getSide3() {
        return this.side3;
    }

    // override toString method with output from the book
    @Override
    public String toString() {
        return "Triangle: side1 = " + side1 + " side2 = " + side2 +
                " side3 = " + side3;
    }
}
