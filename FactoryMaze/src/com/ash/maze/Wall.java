package com.ash.maze;

public class Wall implements MapSite {
    @Override
    public void enter() {
        System.out.println("This is a regular wall, ouch!");
    }

    @Override
    public String toString() {
        return "Regular wall";
    }
}
