package ru.java.calculator.controller.operation;

import ru.java.calculator.controller.operation.arithmetic.*;

public class CalcExpression {

    public static double calcExpression() {
        try {
            Double[] variable = new Double[2];
            variable[0] = Double.parseDouble(StringConversion.convertStringCalc()[0]); //firstNum
            String action = StringConversion.convertStringCalc()[1]; //sign between numbers
            variable[1] = Double.parseDouble(StringConversion.convertStringCalc()[2]); //secondNum
            Operation operation;
            switch (action) {
                case "+":
                    operation = new Plus(variable[0], variable[1]);
                    return operation.calculate();
                case "-":
                    operation = new Minus(variable[0], variable[1]);
                    return operation.calculate();
                case "*":
                    operation = new Multiply(variable[0], variable[1]);
                    return operation.calculate();
                case "/":
                    operation = new Divide(variable[0], variable[1]);
                    return operation.calculate();
                default:
                    return 0;
            }
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}

