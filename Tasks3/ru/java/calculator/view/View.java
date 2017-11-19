package ru.java.calculator.view;

import javax.swing.*;

import ru.java.calculator.view.login.WindowLogIn;
import ru.java.calculator.view.login.LogInField;
import ru.java.calculator.view.app.WindowApp;
import ru.java.calculator.view.app.CalcField;

public class View extends JFrame {

    private static WindowLogIn windowLogIn;

    private static WindowApp windowApp;

    public static WindowLogIn getWindowLogIn() {
        if (windowLogIn == null)
            windowLogIn = new WindowLogIn();
        return windowLogIn;
    }

    public static WindowApp getWindowApp() {
        if (windowApp == null) {
            windowLogIn.dispose();
            windowApp = new WindowApp();
        }
        return windowApp;
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
}