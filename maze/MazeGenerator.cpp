
#include "MazeGenerator.h"

Maze* MazeGenerator::CreateMazeStupidly() {
    Maze* maze = new Maze;
    Room* r1 = new Room(1);
    Room* r2 = new Room(2);
    Door* d = new Door(r1, r2);

    maze->AddRoom(r1);
    maze->AddRoom(r2);

    r1->setSide(North, new Wall);
    r1->setSide(East, d);
    r1->setSide(South, new Wall);
    r1->setSide(West, new Wall);

    r2->setSide(North, new Wall);
    r2->setSide(East, new Wall);
    r2->setSide(South, new Wall);
    r2->setSide(West, d);

    return maze;
}

int main() {
    cout << "Hello" <<endl;
    MazeGenerator generator;// = new MazeGenerator;
    Maze* aMaze =  generator.CreateMazeStupidly();
    aMaze->printStatus();
    
    //maze->currentRoom->move(North);

    return 0;
}
