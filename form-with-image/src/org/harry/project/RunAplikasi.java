package org.harry.project;

import javax.swing.*;

public class RunAplikasi {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Data User Bank");
        jf.setContentPane(new BankInput().getRootPanel());
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.setSize(500,280);
        jf.setLocationRelativeTo(null);
        jf.setVisible(true);
    }
}
