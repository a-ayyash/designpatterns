package com.patterns.structural.Decorator;

/**
 * Created by ayyash on 05/06/16.
 */
public class WhipCream extends CondimentDecorator {
    private Beverage beverage;

    public WhipCream(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.getDescription() + ", Whipped Cream";
    }

    @Override
    public double cost() {
        return this.beverage.cost() + 12.0;
    }
}
