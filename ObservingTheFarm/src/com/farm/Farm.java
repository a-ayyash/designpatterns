package com.farm;

import java.util.Random;
import java.util.TimerTask;

/**
 * Created by ayyash on 08/06/16.
 */
public class Farm {
    private int trees;
    private int cows;
    private int horses;
    private Receiver receiver;
    private static Farm farm;


    public Farm(Receiver _receiver) {
        trees = 0;
        cows = 0;
        horses = 0;
        receiver = _receiver;

        startCore();
    }

    public Farm() {
        trees = 0;
        cows = 0;
        horses = 0;

        startCore();
    }

    public void setReceiver(Receiver receiver) {
        this.receiver = receiver;
    }

    static Farm sharedInstance() {
        if (farm == null) {
            farm = new Farm();
        }

        return farm;
    }

    public void startCore() {
        java.util.Timer timer = new java.util.Timer();
        Random random = new Random();
        Farm farm = this;

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                trees = random.nextInt(50);
                cows = random.nextInt(50);
                horses = random.nextInt(50);

                if (receiver == null) {
                    return;
                }

                receiver.readingsChanged(farm);
            }
        }, 2000, 1000);
    }


    public int getTrees() {
        return trees;
    }

    public int getCows() {
        return cows;
    }

    public int getHorses() {
        return horses;
    }
}
