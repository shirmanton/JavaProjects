package ru.java.calculator.controller.operation;

import ru.java.calculator.controller.operation.arithmetic.*;

public class CalcExpression {

    public static double calcExpression() {
        StringConversion.clean();
        Operation operation;
        int count = 0;
        try {
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
        } catch (IndexOutOfBoundsException e) {
            return 0;
        }
        return StringConversion.getMathOperands().get(0);
    }

    private static void intermediateCalc(Operation operation, int i) {
        StorageCalc.writeCalc(operation, i);
        if(StorageCalc.checkCalc(operation, i)) StringConversion.getMathOperands().set(i + 1, StorageCalc.getResult(operation, i));
        else StringConversion.getMathOperands().set(i + 1, operation.calculate());
        StringConversion.getMathOperands().remove(i);
        StringConversion.getMathSign().remove(i);
    }
}

