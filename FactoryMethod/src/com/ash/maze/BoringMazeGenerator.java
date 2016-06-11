package com.ash.maze;

public class BoringMazeGenerator {
    public static Maze createMaze() {
        Maze maze = new Maze();
        Room room1 = new Room(0);
        Room room2 = new Room(1);
        Door door = new Door(room1, room2);

        maze.addRoom(room1);
        maze.addRoom(room2);

        room1.setSide(Direction.NORTH, new Wall());
        room1.setSide(Direction.EAST, door);
        room1.setSide(Direction.SOUTH, new Wall());
        room1.setSide(Direction.WEST, new Wall());

        room2.setSide(Direction.NORTH, new Wall());
        room2.setSide(Direction.EAST, new Wall());
        room2.setSide(Direction.SOUTH, new Wall());
        room2.setSide(Direction.WEST, door);

        return maze;
    }
}
