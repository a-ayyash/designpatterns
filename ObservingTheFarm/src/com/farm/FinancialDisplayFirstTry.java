package com.farm;

/**
 * Created by ayyash on 08/06/16.
 */
public class FinancialDisplayFirstTry {

    public void update(int cows, int horses, int trees) {
        int cowsWorth = cows * 12;
        int horsesWorth = horses * 23;
        int treesWorth = trees * 55;

        int total = cowsWorth + horsesWorth + treesWorth;

        Dashboard.updateSecond("Your net worth = " + total);
    }
}
