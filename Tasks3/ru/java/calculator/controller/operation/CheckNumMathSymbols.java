package ru.java.calculator.controller.operation;

import ru.java.calculator.controller.Controller;
import ru.java.calculator.view.app.CalcField;

public class CheckNumMathSymbols {

    public static int getNumMathSymbols() {
        int numMathSymbols=0;
        for(int i = 0; i < Controller.getCalcField().getText().length(); i++) {
            if        (Controller.getCalcField().getText().charAt(i) == 42   // *
                    || Controller.getCalcField().getText().charAt(i) == 43   // +
                    || Controller.getCalcField().getText().charAt(i) == 45   // -
                    || Controller.getCalcField().getText().charAt(i) == 47){ // '/'
                numMathSymbols++;
            }
        }
        if(CalcField.getCalcField().getText().charAt(0)=='-') numMathSymbols--;
        return numMathSymbols;
    }
}