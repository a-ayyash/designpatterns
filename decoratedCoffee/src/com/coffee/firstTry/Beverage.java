package com.coffee.firstTry;

public class Beverage {
    private static final double MILK_COST = 0.5;
    private static final double SOY_COST = 1.2;
    private static final double MOCHA_COST = 2.4;
    private static final double WHIP_COST = 1.0;
    String description;
    private boolean soy;
    private boolean milk;
    private boolean mocha;
    private boolean whip;

    public Beverage(){
        description = "DEFAULT BEVERAGE, DO NOT DRINK";
    }

    public String getDescription() {
        return description;
    }

    public double cost() {
       double cost = 0.0;

        if (hasMilk()) {
            cost += MILK_COST;
        }

        if (hasMocha()) {
            cost += MOCHA_COST;
        }

        if (hasSoy()) {
            cost += SOY_COST;
        }

        if (hasWhip()) {
            cost += WHIP_COST;
        }

        return cost;
    }


    public boolean hasMilk() {
        return milk == true;
    }

    public void setMilk(boolean _milk) {
        this.milk = _milk;
    }

    public boolean hasSoy() {
        return soy == true;
    }

    public void setSoy(boolean _soy) {
        this.soy = _soy;
    }

    public boolean hasMocha() {
        return mocha == true;
    }

    public void setMocha(boolean _mocha) {
        this.mocha = _mocha;
    }

    public boolean hasWhip() {
        return whip == true;
    }

    public void setWhip(boolean _whip) {
        this.whip = _whip;
    }
}
