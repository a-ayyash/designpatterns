package com.coffee.firstTry;

public class HouseBlend extends Beverage {
    private static final double HOUSE_BLEND_COST = 15.5;

    public HouseBlend() {
        description = "BEST HOUSE BLEND EVER";
    }

    @Override
    public double cost() {
        return super.cost() + HOUSE_BLEND_COST;
    }
}
