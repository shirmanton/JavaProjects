package ru.java.calculator.controller.operation;

import ru.java.calculator.controller.Controller;
import java.util.ArrayList;

class StringConversion {

    private static ArrayList<Double> operand = new ArrayList<>();

    private static ArrayList<Character> sign = new ArrayList<>();

    static ArrayList<Double> getMathOperands() {
        try {
            if (operand.isEmpty()) {
                StringBuilder stringOperand = new StringBuilder();
                for(int i = 0 ; i < Controller.getCalcField().getText().length(); i++) {
                    if(Controller.getCalcField().getText().charAt(i) == ' ') {
                        operand.add(Double.parseDouble(stringOperand.toString()));
                        stringOperand = new StringBuilder();
                        i += 2;
                    }
                    else stringOperand.append(Controller.getCalcField().getText().charAt(i));
                }
                operand.add(Double.parseDouble(stringOperand.toString()));
            }
        } catch (NumberFormatException e){
            return null;
        }
        return operand;
    }

    static ArrayList<Character> getMathSign() {
        if(sign.isEmpty()) {
            for(int i = 1; i < Controller.getCalcField().getText().length(); i++) {
                if        (Controller.getCalcField().getText().charAt(i) == 42   // *
                        || Controller.getCalcField().getText().charAt(i) == 43   // +
                        || Controller.getCalcField().getText().charAt(i) == 45   // -
                        || Controller.getCalcField().getText().charAt(i) == 47){ // '/'
                    sign.add(Controller.getCalcField().getText().charAt(i));
                }
            }
        }
        return sign;
    }

    static int checkNumSignPnM() {
        int count = 0;
        for (Character aSign : sign) {
            if (aSign == '+' || aSign == '-')
                count++;
        }
        return count;
    }

    static int checkNumSignMnD() {
        int count = 0;
        for (Character aSign : sign) {
            if (aSign == '*' || aSign == '/')
                count++;
        }
        return count;
    }

    static void clean() {
        StringConversion.getMathOperands().clear();
        StringConversion.getMathSign().clear();
    }
}