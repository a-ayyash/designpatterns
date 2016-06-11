package com.coffee.decorated;

public class Whip extends CondimentDecorator {
    private static final double WHIP_COST = 1.0;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return this.beverage.cost() + WHIP_COST;
    }
}
