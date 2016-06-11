package com.farm;

import javax.swing.*;

/**
 * Created by ayyash on 07/06/16.
 */
public class Dashboard {
    private JPanel panel1;
    public  JLabel firstLabel;
    private JLabel secondLabel;
    private JLabel thirdLabel;
    private JLabel fourthLabel;
    private static Dashboard dashboard;


    public static void main(String[] args) {
        JFrame frame = new JFrame("Dashboard");
        dashboard = new Dashboard();
        frame.setContentPane(dashboard.panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        dashboard.firstLabel.setText("asdfasdf");
        frame.setVisible(true);

        //First Try
        //FarmListenerFirstTry fl = new FarmListenerFirstTry();


        //Fire up the observer
        FarmPublisher pub = new FarmPublisher();
        FinancialDisplay fd = new FinancialDisplay(pub);
    }

    public static void updateFirst(String str) {
        dashboard.firstLabel.setText(str);
    }

    public static void updateSecond(String str) {
        dashboard.secondLabel.setText(str);
    }

    public static void updateThird(String str) {
        dashboard.thirdLabel.setText(str);
    }

    public static void updateFourth(String str) {
        dashboard.fourthLabel.setText(str);
    }



}