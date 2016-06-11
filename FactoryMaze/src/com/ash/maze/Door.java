package com.ash.maze;

public class Door implements MapSite {
    private final Room firstRoom;
    private final Room secondRoom;
    private boolean isOpen;

    public Door(Room firstRoom, Room secondRoom) {
        this.firstRoom = firstRoom;
        this.secondRoom = secondRoom;
        this.isOpen = false;
    }

    void open() {
        this.isOpen = true;
    }

    void close() {
        this.isOpen = false;
    }

    boolean isOpen() {
        return this.isOpen;
    }

    @Override
    public void enter() {

    }

    @Override
    public String toString() {
       return "Regular door between room: " + this.firstRoom.number() + " and room: " + this.secondRoom.number();
    }
}
