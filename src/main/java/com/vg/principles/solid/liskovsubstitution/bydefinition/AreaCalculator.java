package com.vg.principles.solid.liskovsubstitution.bydefinition;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AreaCalculator {

    double computedArea;

    public AreaCalculator(Shape shape) {
        computedArea = 0;
        // logic to compute the sum of areas
    }

    public double sum() {
        return computedArea;
    }
}
