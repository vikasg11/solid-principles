package com.vg.principles.solid.openclosed.bydefinition;

public class Rectangle extends Shape {

    int length;
    int breadth;

    @Override
    public double perimeter() {
        return (length + breadth) * 2;
    }
}
