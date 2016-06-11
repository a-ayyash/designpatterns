package com.observer;

/**
 * Created by ayyash on 09/06/16.
 */
public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
