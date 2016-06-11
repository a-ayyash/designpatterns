#ifndef DOOR_H
#define DOOR_H

#include "MapSite.h"
#include "Room.h"

class Door : public MapSite {
    public:
        Door(Room*, Room*);

        virtual void Enter();
        virtual string desc();

        bool isOpen();
    private:
        Room* _firstRoom;
        Room* _secondRoom;
        bool _isOpen;
};

#endif
