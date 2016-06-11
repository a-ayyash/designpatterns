#include "Door.h"

Door::Door(Room* firstRoom, Room* secondRoom) {
    _firstRoom = firstRoom;
    _secondRoom = secondRoom;
    _isOpen = false;
}

void Door::Enter() {
    cout << "Door is open FROM " << endl; 
    _isOpen = !_isOpen;
}

bool Door::isOpen() {
    return _isOpen;
}

string Door::desc() {
    return "door";
}
