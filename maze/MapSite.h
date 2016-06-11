#ifndef MAP_SITE_H
#define MAP_SITE_H
#include <iostream>
using namespace std;

class MapSite {
    public:
        virtual void Enter() = 0;
        virtual string desc() = 0;
};


#endif
