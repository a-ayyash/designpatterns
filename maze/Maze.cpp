
#include "Maze.h"

//Room* _rooms[MAZE_SIZE];

Maze::Maze() {
    _currentRoom = 0;
}

void Maze::AddRoom(Room* room) {
    if (_currentRoom < MAZE_SIZE) {
        _rooms[_currentRoom++] = room;
    }
}

Room* Maze::roomNo(int roomNumber) const {
    if (roomNumber < MAZE_SIZE) {
        return _rooms[roomNumber];
    } else {
        return NULL;
    }
}

void Maze::printStatus() {
    //rooms
    cout << "Maze contains " << _currentRoom  << " rooms" << endl;

    for(int i = 0; i < _currentRoom; i++) {
        _rooms[i]->printStatus();
    }
}
