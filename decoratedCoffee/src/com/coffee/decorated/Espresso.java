package com.coffee.decorated;

/**
 * Created by ayyash on 11/06/16.
 */
public class Espresso extends Beverage {
    @Override
    public String getDescription() {
        return "Espresso";
    }

    @Override
    public double cost() {
        return 5;
    }
}
