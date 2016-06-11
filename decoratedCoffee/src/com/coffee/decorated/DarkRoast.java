package com.coffee.decorated;


/**
 * Created by ayyash on 11/06/16.
 */
public class DarkRoast extends Beverage {
    @Override
    public String getDescription() {
        return "Dark Roast";
    }

    @Override
    public double cost() {
        return 13.5;
    }
}
