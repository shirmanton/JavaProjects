package ru.java.calculator.view.login;

import javax.swing.*;

public class LogInField {

    private static JTextField username;

    private static JPasswordField password;

    LogInField(WindowLogIn windowLogIn) {
        windowLogIn.add(getLogin());
        windowLogIn.add(getPassword());
    }

    public static JTextField getLogin() {
        if (username  == null) {
            username = new JTextField();
            username.setBounds(130, 120, 150, 25);
        }
        return username;
    }

    public static JPasswordField getPassword() {
        if (password == null) {
            password = new JPasswordField();
            password.setBounds(130, 170, 150, 25);
        }
        return password;
    }
}