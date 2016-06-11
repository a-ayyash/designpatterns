package com.warriors;
import com.behaviors.*;

abstract class Warrior {
    AttackBehavior attackBehavior;
    DanceBehavior danceBehavior;

    Warrior() {

    }

    public abstract void performAttack();
    public abstract void performDance();
    public abstract void show();

    public void setAttackBehavior(AttackBehavior ab) {
        this.attackBehavior = ab;
    }

    public void setDanceBehavior(DanceBehavior db) {
        this.danceBehavior = db;
    }

    public void defend() {
        System.out.println("I block this as a warrior, generally!");
    }

}
