package com;
import com.ash.maze.*;
import com.patterns.structural.Decorator.Beverage;
import com.patterns.structural.Decorator.HouseBlend;
import com.patterns.structural.Decorator.Mocha;
import com.patterns.structural.Decorator.SoyMilk;
import com.patterns.creational.FactoryMethod.*;
import com.patterns.structural.Decorator.*;

public class Main {
    static void runFactory() {
        Maze maze = BoringMazeGenerator.createMaze();
        System.out.println(maze);

        System.out.println("******************************");
        System.out.println("******************************");

        Maze factoryMaze = new MazeGame().createMaze();
        System.out.println(factoryMaze);

        System.out.println("******************************");
        System.out.println("******************************");

        Maze enchantedMaze = new EnchantedMazeGame().createMaze();
        System.out.println(enchantedMaze);
    }

    static void runDecorator() {
        Beverage houseBlend = new HouseBlend();
        System.out.println(houseBlend.getDescription());
        System.out.println(houseBlend.cost());

        houseBlend = new Mocha(houseBlend);
        houseBlend = new Mocha(houseBlend);
        houseBlend = new SoyMilk(houseBlend);

        System.out.println(houseBlend.getDescription());
        System.out.println(houseBlend.cost());

    }

    public static void main(String[] args) {
//        Main.runFactory();
        Main.runDecorator();
    }
}
