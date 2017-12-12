package ru.java.calculator.controller;

import ru.java.calculator.controller.operation.login.PasswordEncryption;
import ru.java.calculator.model.Model;
import ru.java.calculator.view.View;

import javax.swing.*;

public class Controller {

    private static String[] userName = new String[2];

    private static String[] userPassword = new String[2];

    public static String[] getUserName() {
        userName[0] = Model.getUserName();
        userName[1] = View.getLogin().getText();
        return userName;
    }

    public static String[] getUserPassword() {
        userPassword[0] = Model.getUserPassword();
        userPassword[1] = PasswordEncryption.encryptMD5(View.getPassword().getText());
        return userPassword;
    }

    public static JTextField getCalcField() {
        return View.getCalcField();
    }
}