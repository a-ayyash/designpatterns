package com.ash.maze;

import java.util.HashMap;

public class EnchantedRoom extends Room {

    public EnchantedRoom(int roomNumber) {
        super(roomNumber);
    }

    @Override
    public void enter() {
        System.out.println("ENCHANTED room number: " + this.roomNumber);
    }

    @Override
    public String toString() {
        StringBuffer description = new StringBuffer();

        description.append("ENCHANTED room number: " + this.roomNumber + "\n");

        for (Direction dir : this.sides.keySet()) {
            description.append(" On the " + dir + " side, there is a " + this.sides.get(dir)+ "\n");
        }

        return description.toString();
    }

}
