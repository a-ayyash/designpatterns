package com.farm;

/**
 * Created by ayyash on 08/06/16.
 */
public class FarmListenerFirstTry implements Receiver {
    private Farm origin;
    private InventoryDisplayFirstTry inventoryDisplayFirstTry;
    private FinancialDisplayFirstTry financialDisplayFirstTry;
    private AnalysisDisplayFirstTry analysisDisplayFirstTry;

    public FarmListenerFirstTry() {
        origin = Farm.sharedInstance();
        origin.setReceiver(this);
        inventoryDisplayFirstTry = new InventoryDisplayFirstTry();
        financialDisplayFirstTry = new FinancialDisplayFirstTry();
        analysisDisplayFirstTry = new AnalysisDisplayFirstTry();
    }

    private void firstTry() {
        int trees = origin.getTrees();
        int horses = origin.getHorses();
        int cows = origin.getCows();

        //concrete
        inventoryDisplayFirstTry.update(cows, horses, trees);
        financialDisplayFirstTry.update(cows, horses, trees);
        //analysisDisplayFirstTry.update(cows, horses, trees);
        //new ones ?
        //adding displays at runtime ?
    }

    @Override
    public void readingsChanged(Farm farm) {
        origin = farm;
        firstTry();
    }
}
