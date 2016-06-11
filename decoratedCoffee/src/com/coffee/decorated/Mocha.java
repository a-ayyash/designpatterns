package com.coffee.decorated;

public class Mocha extends CondimentDecorator {
    private static final double MOCHA_COST = 2.4;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return this.beverage.cost() + MOCHA_COST;
    }
}
