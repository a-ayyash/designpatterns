package com.coffee.decorated;

public class Milk extends CondimentDecorator {
    private static final double MILK_COST = 0.5;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    @Override
    public double cost() {
        return MILK_COST + beverage.cost();
    }
}
