package com.patterns.structural.Decorator;

/**
 * Created by ayyash on 05/06/16.
 */
public class SoyMilk extends CondimentDecorator {
    private Beverage beverage;

    public SoyMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Soy Milk";
    }

    @Override
    public double cost() {
        return this.beverage.cost() + 1.0;
    }
}
