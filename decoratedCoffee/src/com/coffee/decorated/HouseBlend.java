package com.coffee.decorated;

/**
 * Created by ayyash on 11/06/16.
 */
public class HouseBlend extends Beverage {
    @Override
    public String getDescription() {
        return "House Blend";
    }

    @Override
    public double cost() {
        return 15.5;
    }
}
