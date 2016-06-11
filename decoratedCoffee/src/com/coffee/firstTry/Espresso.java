package com.coffee.firstTry;

public class Espresso extends Beverage {
    private static final double ESPRESSO_COST = 5;

    public Espresso() {
        description = "BEST ESPRESSO EVER";
    }

    @Override
    public double cost() {
        return super.cost() + ESPRESSO_COST;
    }
}
