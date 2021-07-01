package com.vg.principles.solid.openclosed.bydefinition;

// Shape class is open for extension (can have any number of shapes added),
// but computePerimeter is closed for modification.
public abstract class Shape {
    abstract double perimeter();

    public double computePerimter(Shape[] shapes) {
        double totalPerimeter = 0;
        for (Shape shape : shapes) {
            totalPerimeter += shape.perimeter();
        }
        return totalPerimeter;
    }
}
