package com.vg.principles.solid.liskovsubstitution.bydefinition;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AreaVolumePrinter {

    public void printAreaVolume (AreaCalculator areaCalculator) {
        log.info("Computed Area / Volume: " + areaCalculator.sum());
    }
}
