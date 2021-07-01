package com.vg.principles.solid.openclosed.raw;

public class Shape {

    public double computePerimeter(Shape[] shapes) {
        double totalPerimeter = 0;
        for (Shape shape : shapes) {
            if (shape instanceof Rectangle) {
                totalPerimeter += (((Rectangle) shape).length
                        + ((Rectangle) shape).breadth) * 2;
            } else if (shape instanceof Triangle) {
                totalPerimeter += ((Triangle) shape).side1
                        + ((Triangle) shape).side2
                        + ((Triangle) shape).side3;
            }
        }
        //TODO -- problem to solve in raw implementation is that
        // in case new shape comes up, this class / method will be modified
        return totalPerimeter;
    }
}
