package ru.java.calculator.view;

import javax.swing.*;

import ru.java.calculator.view.login.WindowLogIn;
import ru.java.calculator.view.login.LogInField;
import ru.java.calculator.view.app.WindowApp;
import ru.java.calculator.view.app.CalcField;
import ru.java.calculator.view.hash.WindowHash;
import ru.java.calculator.view.hash.HashField;

public class View extends JFrame {

    private static WindowLogIn windowLogIn;

    public static WindowLogIn getWindowLogIn() {
        if (windowLogIn == null)
            windowLogIn = new WindowLogIn();
        return windowLogIn;
    }

    public static void getWindowApp() {
        windowLogIn.dispose();
        new WindowHash();
        new WindowApp();
    }

    public static JTextField getLogin() {
        return LogInField.getLogin();
    }

    public static JPasswordField getPassword() {
        return LogInField.getPassword();
    }

    public static JTextField getCalcField() {
        return CalcField.getCalcField();
    }

    public static JTextField getHashField(int i) {
        return HashField.getHashField(i);
    }
}