package ru.java.server.operation;

import java.util.ArrayList;

class StringConversion {

    private static ArrayList<Double> operand = new ArrayList<>();

    private static ArrayList<Character> sign = new ArrayList<>();

    private static String inputString = null;

    static ArrayList<Double> getMathOperands() {
        try {
            if (operand.isEmpty()) {
                StringBuilder stringOperand = new StringBuilder();
                for(int i = 0 ; i < inputString.length(); i++) {
                    if(inputString.charAt(i) == ' ') {
                        operand.add(Double.parseDouble(stringOperand.toString()));
                        stringOperand = new StringBuilder();
                        i += 2;
                    }
                    else stringOperand.append(inputString.charAt(i));
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
            for(int i = 1; i < inputString.length(); i++) {
                if        (inputString.charAt(i) == 42   // *
                        || inputString.charAt(i) == 43   // +
                        || inputString.charAt(i) == 45   // -
                        || inputString.charAt(i) == 47){ // '/'
                    sign.add(inputString.charAt(i));
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

    static void setInputString(String inputString) {
        StringConversion.inputString = inputString;
    }

    static String getInputString() {
        return inputString;
    }

    static void clean() {
        StringConversion.getMathOperands().clear();
        StringConversion.getMathSign().clear();
    }
}