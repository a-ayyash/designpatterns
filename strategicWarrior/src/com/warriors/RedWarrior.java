package com.warriors;

import com.behaviors.FireAttack;
import com.behaviors.VictoryDance;

/**
 * Created by ayyash on 05/06/16.
 */
public class RedWarrior extends Warrior {

    public RedWarrior() {
        this.attackBehavior = new FireAttack();
        this.danceBehavior = new VictoryDance();
    }

    @Override
    public void performAttack() {
        this.attackBehavior.attack();
    }

    @Override
    public void performDance() {
        this.danceBehavior.dance();
    }

    @Override
    public void show() {
        System.out.println("Display Red Warrior");
    }
}
