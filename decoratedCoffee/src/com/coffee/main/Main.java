package com.coffee.main;

import com.coffee.decorated.Beverage;
import com.coffee.firstTry.*;
import com.coffee.decorated.*;
import com.coffee.firstTry.DarkRoast;

public class Main {
    public static void main(String[] args) {
        DarkRoast darkRoast = new DarkRoast();

        System.out.println(darkRoast.getDescription() + " costs= " + darkRoast.cost());

        darkRoast.setMilk(true);
        darkRoast.setMocha(true);

        System.out.println(darkRoast.getDescription() + " costs= " + darkRoast.cost());


        //Add Tea ( tea with chocolate ? )


        Beverage decoratedRoast = new com.coffee.decorated.DarkRoast();
        decoratedRoast = new Milk(decoratedRoast);
        decoratedRoast = new Mocha(decoratedRoast);

        System.out.println(decoratedRoast.getDescription() + " costs= " + decoratedRoast.cost());

        //Now Add Tea and a new condiment ( pumkin spice )

    }
}
