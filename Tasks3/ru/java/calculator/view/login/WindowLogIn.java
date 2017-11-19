package ru.java.calculator.view.login;

import javax.swing.*;

public class WindowLogIn extends JFrame {

    public WindowLogIn() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Calculator");
        this.setSize(340, 400);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.getContentPane().setLayout(null);
        new LogInLabel(this);
        new LogInField(this);
        new LogInButton(this);
        this.setVisible(true);
    }
}