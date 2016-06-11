package com.farm;

/**
 * Created by ayyash on 08/06/16.
 */
public class AnalysisDisplayFirstTry {
    public void update(int cows, int horses, int trees) {
        String cowsMsg = "Cows = good";
        String horsesMsg = "Horses = good";
        String treesMsg = "Trees = good";

        if (cows < 25) {
            cowsMsg = "Cows = bad";
        }

        if (trees < 25) {
            treesMsg = "Trees = bad";
        }

        if (horses < 25) {
            horsesMsg = "Horses = bad";
        }

        Dashboard.updateThird("<html> <br>"+cowsMsg+"<br>"+treesMsg+"<br>"+horsesMsg+"</html>");
    }
}
