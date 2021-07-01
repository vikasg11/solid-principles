package com.vg.principles.solid.interfacesegregation.raw;

public class Lion extends Animal {

    @Override
    public void feed() {
        //feed the lion -- too dangerous
    }

    @Override
    public void FavPetFood() {
        //not required.. but need implementation to keep compiler happy
    }
}
