package ru.java.calculator.controller.listener;

import ru.java.calculator.controller.Controller;
import ru.java.calculator.controller.operation.CalcExpression;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcButtonListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        double result = CalcExpression.calcExpression();
        if(result % 1 == 0) {
            Controller.getCalcField().setText(Integer.toString((int)result));
        }
        else Controller.getCalcField().setText(Double.toString(result));
    }
}