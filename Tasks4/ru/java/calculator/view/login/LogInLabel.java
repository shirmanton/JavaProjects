package ru.java.calculator.view.login;

import javax.swing.*;

class LogInLabel {

    private JLabel username;

    private JLabel password;

    LogInLabel(WindowLogIn windowLogIn) {
        windowLogIn.add(getUsername());
        windowLogIn.add(getPassword());
    }

    private JLabel getUsername() {
        if (username == null) {
            username = new JLabel("username:");
            username.setBounds(60, 120, 150, 25);
        }
        return username;
    }

    private JLabel getPassword() {
        if (password == null) {
            password = new JLabel("password:");
            password.setBounds(60, 170, 150, 25);
        }
        return password;
    }
}