package com.farm;

public class InventoryDisplayFirstTry {

    public void update(int cowsCount, int horsesCount, int treesCount) {
        Dashboard.updateFirst("<html>Current Inventory<br> "+cowsCount+" Cows<br> "+horsesCount+" Horses<br>"+treesCount+" Trees</html>");
    }
}
