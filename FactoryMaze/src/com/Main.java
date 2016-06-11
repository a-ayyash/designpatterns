package com;
import com.ash.maze.*;
import com.patterns.creational.FactoryMethod.*;

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

    public static void main(String[] args) {
        Main.runFactory();
    }
}
