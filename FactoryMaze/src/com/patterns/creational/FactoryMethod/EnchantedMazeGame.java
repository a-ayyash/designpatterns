package com.patterns.creational.FactoryMethod;

import com.ash.maze.*;

public class EnchantedMazeGame extends MazeGame {

    @Override
    public Room makeRoom(int roomNumber) {
        return new EnchantedRoom(roomNumber, Spells.WATER_SHIELD);
    }
}
