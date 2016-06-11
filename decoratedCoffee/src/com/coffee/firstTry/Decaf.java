package com.coffee.firstTry;

public class Decaf extends Beverage {
    private static final double DECAF_COST = 10.5;

    public Decaf() {
        description = "BEST DECAF EVER";
    }

    @Override
    public double cost() {
        return super.cost() + DECAF_COST;
    }
}
