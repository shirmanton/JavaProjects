package ru.java.calculator.controller.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ru.java.calculator.controller.Controller;

public class CharButtonListener implements ActionListener{

    private char symbol;

    public CharButtonListener(char symbol) {
        this.symbol = symbol;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (Controller.getCalcField().getText().equals("0") && symbol!='.'){
            Controller.getCalcField().setText("" + symbol);
        }
        else Controller.getCalcField().setText(Controller.getCalcField().getText() + symbol);
    }
}