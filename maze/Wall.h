#ifndef WALL_H
#define WALL_H

#include "MapSite.h"

class Wall : public MapSite {
    public:
        Wall();

        virtual void Enter();
        virtual string desc();
};


#endif
