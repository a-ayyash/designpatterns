package com.patterns.creational.FactoryMethod;

import com.ash.maze.Direction;
import com.ash.maze.Room;

class EnchantedRoom extends Room {
    private String roomDescription;

    EnchantedRoom(int roomNumber, Spells spell) {
        super(roomNumber);
        roomDescription = "ENCHANTED room number: " + this.roomNumber + " With a spell: " +spell.getString() +"\n";
    }

    @Override
    public void enter() {
        System.out.println(roomDescription);
    }

    @Override
    public String toString() {
        StringBuffer description = new StringBuffer();

        description.append(roomDescription);

        for (Direction dir : this.sides.keySet()) {
            description.append(" On the " + dir + " side, there is a " + this.sides.get(dir)+ "\n");
        }

        return description.toString();
    }

}
