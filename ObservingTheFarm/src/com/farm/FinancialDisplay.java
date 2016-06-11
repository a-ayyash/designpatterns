package com.farm;

import com.observer.Observer;
import com.observer.Subject;

/**
 * Created by ayyash on 09/06/16.
 */
public class FinancialDisplay implements Observer, Display {
    private int cows;
    private int horses;
    private int trees;

    //Why would we need that ?
    //private Subject farmData;

    FinancialDisplay(Subject farmData) {
        //this.farmData = farmData;
       farmData.registerObserver(this);
    }

    @Override
    public void display() {
        int cowsWorth = cows * 12;
        int horsesWorth = horses * 23;
        int treesWorth = trees * 55;

        int total = cowsWorth + horsesWorth + treesWorth;

        Dashboard.updateSecond("Your net worth = " + total);
    }

    @Override
    public void update(int cows, int horses, int trees) {
        this.cows = cows;
        this.horses = horses;
        this.trees = trees;

        display();
    }
}
