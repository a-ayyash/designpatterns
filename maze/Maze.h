#ifndef MAZE_H
#define MAZE_H
#define MAZE_SIZE 5

#include "Room.h"

class Maze {
    public:
        Maze();

        void AddRoom(Room* room);
        void printStatus();
        Room* roomNo(int roomNumber) const;

    private:
        Room* _rooms[MAZE_SIZE];
        int _currentRoom;
};
#endif
