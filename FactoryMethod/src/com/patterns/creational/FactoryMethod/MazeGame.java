package com.patterns.creational.FactoryMethod;

import com.ash.maze.*;

public class MazeGame {
    public Maze createMaze() {
        Maze maze = makeMaze();
        Room room1 = makeRoom(0);
        Room room2 = makeRoom(1);
        Door door = makeDoor(room1, room2);

        maze.addRoom(room1);
        maze.addRoom(room2);

        room1.setSide(Direction.NORTH, makeWall());
        room1.setSide(Direction.EAST, door);
        room1.setSide(Direction.SOUTH, makeWall());
        room1.setSide(Direction.WEST, makeWall());

        room2.setSide(Direction.NORTH, makeWall());
        room2.setSide(Direction.EAST, makeWall());
        room2.setSide(Direction.SOUTH, makeWall());
        room2.setSide(Direction.WEST, door);

        return maze;
    }

    public Maze makeMaze() {
        return new Maze();
    }

    public Wall makeWall() {
        return new Wall();
    }

    public Room makeRoom(int roomNumber) {
        return new Room(roomNumber);
    }

    public Door makeDoor(Room room1, Room room2) {
        return new Door(room1, room2);
    }

}
