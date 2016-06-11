package com.ash.maze;

import java.util.ArrayList;

public class Maze {
    private final ArrayList<Room> rooms;
    private int currentRoom;

    public Maze() {
        this.rooms = new ArrayList<>();
        this.currentRoom = 0;
    }

    public void addRoom(Room room) {
        this.rooms.add(this.currentRoom++, room);
    }

    public Room getRoom(int roomNumber) {
        if (roomNumber < this.rooms.size()) {
            return this.rooms.get(roomNumber);
        } else {
            return null;
        }
    }

    @Override
    public String toString() {
        StringBuffer description = new StringBuffer();

        for (int i = 0; i < this.rooms.size(); i++) {
            description.append(this.rooms.get(i) + "\n");
        }

        return description.toString();
    }
}
