#include "Room.h"

string e_to_str(Direction dir) {
    switch(dir) {
        case East:
            return "East";
            break;
        case West:
            return "West";
            break;
        case North:
            return "North";
            break;
        case South:
            return "South";
            break;
        default:
            return "East";
    }
}

Room::Room(int roomNumber) {
    _roomNumber = roomNumber;
}

void Room::Enter() {
    cout << "Entered room number " << _roomNumber;
}

MapSite* Room::getSide(Direction direction) {
    return _sides[direction];
}

void Room::setSide(Direction direction, MapSite* side) {
    _sides[direction] = side;
}

void Room::printStatus() {
    cout << "for room " << _roomNumber << endl;
    Direction direction; 

    for(int i = 0; i < 4; i++) {
        direction = (Direction) i;
        cout << "a " << _sides[direction]->desc() << " in the " << e_to_str(direction) << endl;
    }
}

string Room::desc() {
    return "room";
}


