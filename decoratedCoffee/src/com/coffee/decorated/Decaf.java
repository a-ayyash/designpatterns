package com.coffee.decorated;

/**
 * Created by ayyash on 11/06/16.
 */
public class Decaf extends Beverage {
    @Override
    public String getDescription() {
        return "Decaf";
    }

    @Override
    public double cost() {
        return 10.5;
    }
}
