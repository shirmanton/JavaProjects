package ru.java.calculator.controller.operation;

import ru.java.calculator.controller.Controller;
import ru.java.calculator.controller.operation.arithmetic.*;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Stream;

class StorageCalc {

    static Set<String> storage = new LinkedHashSet<>();

    static void writeCalc(Operation operation, int i) {
        String curCalc = StringConversion.getMathOperands().get(i).toString() + " " + StringConversion.getMathSign().get(i) + " " + StringConversion.getMathOperands().get(i+1).toString()
                + " = " + Double.toString(operation.calculate());
        System.out.println(curCalc);
        if(storage.contains(curCalc)) {
            storage.remove(curCalc);
            storage.add(curCalc);
        }
        else storage.add(curCalc);
        int count = 0;
        for(String entry : storage) {
            count++;
        }
        for(String entry : storage) {
            count--;
            if(count < 6){
                Controller.getHashField(count).setText(entry);
            }
        }
    }

    static boolean checkCalc(Operation operation, int i) {
        String curCalc = StringConversion.getMathOperands().get(i).toString() + " " + StringConversion.getMathSign().get(i) + " " + StringConversion.getMathOperands().get(i+1).toString()
                + " = " + Double.toString(operation.calculate());
        return storage.contains(curCalc);
    }

    static double getResult(Operation operation, int i) {
        String curCalc = StringConversion.getMathOperands().get(i).toString() + " " + StringConversion.getMathSign().get(i) + " " + StringConversion.getMathOperands().get(i+1).toString()
                + " = " + Double.toString(operation.calculate());
        double result = 0;
        int countOfSpace = 0;
        for(int k = 0; k < curCalc.length(); k++) {
            if(curCalc.charAt(k) == ' ') countOfSpace++;
            if (countOfSpace == 4) return result = Double.parseDouble(curCalc.substring(k+1, curCalc.length()));
        }
        return result;
    }
}
