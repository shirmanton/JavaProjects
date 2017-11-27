package ru.java.calculator.view.login;

import javax.swing.*;
import java.awt.event.ActionListener;
import ru.java.calculator.controller.listener.LogInButtonListener;

class LogInButton {

    private JButton logInButton;

    LogInButton(WindowLogIn windowLogIn) {
        windowLogIn.add(getLogInButton());
    }

    private JButton getLogInButton() {
        if (logInButton == null) {
            logInButton = new JButton("Log in");
            logInButton.setBounds(130, 260, 100, 30);
            ActionListener actionListener = new LogInButtonListener();
            logInButton.addActionListener(actionListener);
        }
        return logInButton;
    }
}