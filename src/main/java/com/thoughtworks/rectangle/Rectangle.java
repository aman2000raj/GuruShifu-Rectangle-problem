package com.thoughtworks.rectangle;

public class Rectangle {
    private final double length, breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public double getArea() {
        return length * breadth;
    }

    public double getPerimeter() {
        return 2 * (length + breadth);
    }
    
}
