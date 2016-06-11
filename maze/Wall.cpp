#include "Wall.h"

Wall::Wall() {

}

void Wall::Enter() {
    cout << "Entered a Wall" << endl;
}

string Wall::desc() {
    return "wall";
}
