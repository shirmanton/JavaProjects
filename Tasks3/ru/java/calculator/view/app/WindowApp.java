package ru.java.calculator.view.app;

import javax.swing.*;

public class WindowApp extends JFrame{

    public WindowApp() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Calculator");
        this.setSize(340, 400);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.getContentPane().setLayout(null);
        new Button(this);
        new CalcField(this);
        this.setVisible(true);
    }
}