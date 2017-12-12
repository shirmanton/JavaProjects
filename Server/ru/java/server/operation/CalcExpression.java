package ru.java.server.operation;

import ru.java.server.operation.arithmetic.*;

public class CalcExpression {

    public static String calcExpression(String inputString) throws IndexOutOfBoundsException {
        StringConversion.setInputString(inputString);
        StringConversion.clean();
        Operation operation;
        int count = 0;
        for (int i = 0; i < StringConversion.getMathSign().size(); i++) {
            switch (StringConversion.getMathSign().get(i)) {
                case '*':
                    operation = new Multiply(StringConversion.getMathOperands().get(i), StringConversion.getMathOperands().get(i + 1));
                    intermediateCalc(operation, i);
                    i--;
                    count++;
                    break;
                case '/':
                    operation = new Divide(StringConversion.getMathOperands().get(i), StringConversion.getMathOperands().get(i + 1));
                    intermediateCalc(operation, i);
                    i--;
                    count++;
                    break;
                default:
                    break;
            }
            if (count > StringConversion.checkNumSignMnD()) break;
        }
        count = 0;
        for (int i = 0; i < StringConversion.getMathSign().size(); i++) {
            switch (StringConversion.getMathSign().get(i)) {
                case '+':
                    operation = new Plus(StringConversion.getMathOperands().get(i), StringConversion.getMathOperands().get(i + 1));
                    intermediateCalc(operation, i);
                    i--;
                    count++;
                    break;
                case '-':
                    operation = new Minus(StringConversion.getMathOperands().get(i), StringConversion.getMathOperands().get(i + 1));
                    intermediateCalc(operation, i);
                    i--;
                    count++;
                    break;
                default:
                    break;
            }
            if (count > StringConversion.checkNumSignPnM()) break;
        }
        return StorageCalc.getLastResult();
    }

    private static void intermediateCalc(Operation operation, int i) {
        StorageCalc.writeCalc(operation, i);
        if(StorageCalc.checkCalc(operation, i)) StringConversion.getMathOperands().set(i + 1, StorageCalc.getResult(operation, i));
        else StringConversion.getMathOperands().set(i + 1, operation.calculate());
        StringConversion.getMathOperands().remove(i);
        StringConversion.getMathSign().remove(i);
    }
}

