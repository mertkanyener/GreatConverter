package gui;

import javax.swing.*;


public class Main {

    private JButton buttonLength;
    private JButton buttonCurrency;
    private JButton buttonWeight;
    private JButton buttonTemp;
    private JButton buttonVolume;
    private JButton buttonSpeed;
    private JPanel panelMain;

    public Main(){

    }


    public static void main(String[] args){
        JFrame frame = new JFrame("Great Converter");
        frame.setContentPane(new Main().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,200);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
