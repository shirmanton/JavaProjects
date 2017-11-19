package ru.java.calculator.controller.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ru.java.calculator.controller.Controller;
import ru.java.calculator.controller.operation.CalcExpression;
import ru.java.calculator.controller.operation.CheckNumMathSymbols;

public class SignButtonListener implements ActionListener {

    private char symbol;

    public SignButtonListener(char symbol) {
        this.symbol = symbol;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (CheckNumMathSymbols.getNumMathSymbols() == 0)
            if(Controller.getCalcField().getText().equals("0") && symbol == '-') Controller.getCalcField().setText("" + symbol);
            else Controller.getCalcField().setText(Controller.getCalcField().getText() + " " + symbol + " ");
        else {
            Controller.getCalcField().setText(Double.toString(CalcExpression.calcExpression()) + " " + symbol + " ");
        }
    }
}