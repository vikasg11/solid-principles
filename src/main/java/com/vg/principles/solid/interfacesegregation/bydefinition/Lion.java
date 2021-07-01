package com.vg.principles.solid.interfacesegregation.bydefinition;

// now Lion class doesn't need to implement a redundant method
public class Lion extends Animal {

    @Override
    public void feed() {
        //feed the lion -- too dangerous
    }
}
