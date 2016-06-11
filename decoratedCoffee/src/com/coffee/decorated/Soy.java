package com.coffee.decorated;

public class Soy extends CondimentDecorator {

    private static final double SOY_COST = 1.2;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return this.beverage.cost() + SOY_COST;
    }
}
