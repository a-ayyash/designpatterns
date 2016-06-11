package com.farm;

import com.observer.*;

import java.util.ArrayList;

public class FarmPublisher implements Subject, Receiver {
    private ArrayList observers;
    private int cows;
    private int horses;
    private int trees;

    FarmPublisher() {
        observers = new ArrayList();
        Farm.sharedInstance().setReceiver(this);
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer o = (Observer)observers.get(i);
            o.update(cows, horses, trees);
        }
    }

    @Override
    public void readingsChanged(Farm farm) {
        trees = farm.getTrees();
        cows = farm.getCows();
        horses = farm.getHorses();

        notifyObservers();
    }
}
