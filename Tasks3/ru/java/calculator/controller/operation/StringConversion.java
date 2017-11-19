package ru.java.calculator.controller.operation;

import ru.java.calculator.controller.Controller;
class StringConversion {

    /*
    variable[0] - first number
    variable[1] - sign between numbers
    variable[2] - second number
     */
    private static String[] variable = new String[3];

    static String[] convertStringCalc() {
        for(int k = 0; k < 3; k++)
            variable[k] = "";
        int k = 0;
        for(int i = 0 ; i < Controller.getCalcField().getText().length(); i++) {
            if (Controller.getCalcField().getText().charAt(i)!=' ') {
                variable[k] += Controller.getCalcField().getText().charAt(i);
            }
            else {
                k++;
            }
        }
        return variable;
    }
}