package ru.java.calculator.view.app;

import javax.swing.*;

public class CalcField {

    private static JTextField calcField;

    CalcField(WindowApp windowApp) {
        windowApp.add(getCalcField());
    }

    public static JTextField getCalcField() {
        if( calcField == null) {
            calcField = new JTextField("0");
            calcField.setBounds(20, 40, 285, 30);
            calcField.setHorizontalAlignment(JTextField.RIGHT);
            calcField.setEditable(false);
        }
        return calcField;
    }
}