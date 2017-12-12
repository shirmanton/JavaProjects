package ru.java.server.hash;

import javax.swing.*;

public class WindowHash extends JFrame{

    public WindowHash() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Calculator");
        this.setSize(340, 400);
        this.setResizable(false);
        this.getContentPane().setLayout(null);
        new HashField(this);
        this.setVisible(true);
    }
}