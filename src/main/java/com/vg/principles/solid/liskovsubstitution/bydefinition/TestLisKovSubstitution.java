package com.vg.principles.solid.liskovsubstitution.bydefinition;

// Let q(x) be a property provable about objects of x of type T.
// Then q(y) should be provable for objects y of type S where S is a subtype of T.
public class TestLisKovSubstitution {

    public static void main(String[] args) {
        Shape normalShape = new Shape();
        Shape3D shape3D = new Shape3D();

        AreaCalculator areaCalculator = new AreaCalculator(normalShape);
        VolumeCalculator volumeCalculator = new VolumeCalculator(shape3D);

        AreaVolumePrinter areaVolumePrinter = new AreaVolumePrinter();

        // q(x)
        areaVolumePrinter.printAreaVolume(areaCalculator);
        // q(y)
        areaVolumePrinter.printAreaVolume(volumeCalculator);
    }
}
