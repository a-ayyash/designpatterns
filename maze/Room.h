#ifndef ROOM_H
#define ROOM_H

#include "MapSite.h"

enum Direction{
    East = 0,
    West,
    North,
    South
};

class Room : public MapSite {
    public:
        Room(int roomNumber);

        virtual void Enter();
        virtual string desc();

        MapSite* getSide(Direction);
        void setSide(Direction, MapSite*);
        void printStatus();

    private:
        MapSite* _sides[4];
        int _roomNumber;
};



#endif
