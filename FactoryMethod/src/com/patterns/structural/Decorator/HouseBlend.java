package com.patterns.structural.Decorator;

public class HouseBlend extends Beverage {

    public HouseBlend(){
        description = "House Blend";
    }

    @Override
    public double cost() {
        return 21.0;
    }
}
