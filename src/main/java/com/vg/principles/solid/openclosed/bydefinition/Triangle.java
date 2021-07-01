package com.vg.principles.solid.openclosed.bydefinition;

public class Triangle extends Shape {

    int side1;
    int side2;
    int side3;

    public double perimeter() {
        return side1 + side2 + side3;
    }
}
