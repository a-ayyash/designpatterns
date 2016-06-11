package com.patterns.creational.FactoryMethod;

import com.ash.maze.*;

/**
 * Created by ayyash on 22/05/16.
 */
public class EnchantedMazeGame extends MazeGame {

    @Override
    public Room makeRoom(int roomNumber) {
        return new EnchantedRoom(roomNumber);
    }
}
