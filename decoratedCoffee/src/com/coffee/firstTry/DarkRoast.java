package com.coffee.firstTry;

public class DarkRoast extends Beverage {

    private static final double DARK_ROAST_COST = 13.5;

    public DarkRoast() {
        description = "BEST DARK ROAST EVER";
    }

    @Override
    public double cost() {
        return super.cost() + DARK_ROAST_COST;
    }
}
