package com.vg.principles.solid.liskovsubstitution.bydefinition;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper=false)
public class VolumeCalculator extends AreaCalculator {

    double computedVolume;

    public VolumeCalculator(Shape shape) {
        computedVolume = 0;
        // logic to compute the volume of the 3D shapes
    }

    public double sum() {
        return computedVolume;
    }
}
