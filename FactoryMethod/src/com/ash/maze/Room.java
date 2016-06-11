package com.ash.maze;

import java.util.HashMap;

public class Room implements MapSite {
    protected int roomNumber;
    protected HashMap<Direction, MapSite> sides;

    public Room() {
        this(0);
    }

    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
        this.sides = new HashMap<>(4);
    }

    public int number() {
        return this.roomNumber;
    }

    public MapSite getSide(Direction direction) {
        return sides.get(direction);
    }

    public void setSide(Direction direction, MapSite side) {
        this.sides.put(direction, side);
    }


    @Override
    public void enter() {
        System.out.println("Entering regular room number: " + this.roomNumber);
    }

    @Override
    public String toString() {
        StringBuffer description = new StringBuffer();

        description.append("Regular room number: " + this.roomNumber + "\n");

        for (Direction dir : this.sides.keySet()) {
           description.append(" On the " + dir + " side, there is a " + this.sides.get(dir)+ "\n");
        }

        return description.toString();
    }
}


