package ru.java.server.operation;

import ru.java.server.hash.HashField;
import ru.java.server.operation.arithmetic.*;
import java.util.LinkedHashSet;
import java.util.Set;

class StorageCalc {

    private static Set<String> storage = new LinkedHashSet<>();

    static void writeCalc(Operation operation, int i) {
        String curCalc = StringConversion.getMathOperands().get(i).toString() + " " + StringConversion.getMathSign().get(i) + " "
                + StringConversion.getMathOperands().get(i+1).toString() + " = " + Double.toString(operation.calculate());
        if(storage.contains(curCalc)) {
            storage.remove(curCalc);
            storage.add(curCalc);
        }
        else storage.add(curCalc);
        int count = 0;
        for(String ignored : storage) {
            count++;
        }
        for(String entry : storage) {
            count--;
            if(count < 6){
                HashField.getHashField(count).setText(entry);
            }
        }
    }

    static boolean checkCalc(Operation operation, int i) {
        String curCalc = StringConversion.getMathOperands().get(i).toString() + " " + StringConversion.getMathSign().get(i) + " "
                + StringConversion.getMathOperands().get(i+1).toString() + " = " + Double.toString(operation.calculate());
        return storage.contains(curCalc);
    }

    static double getResult(Operation operation, int i) {
        String curCalc = StringConversion.getMathOperands().get(i).toString() + " " + StringConversion.getMathSign().get(i) + " "
                + StringConversion.getMathOperands().get(i+1).toString() + " = " + Double.toString(operation.calculate());
        double result = 0;
        int countOfSpace = 0;
        for(int k = 0; k < curCalc.length(); k++) {
            if(curCalc.charAt(k) == ' ') countOfSpace++;
            if (countOfSpace == 4) return Double.parseDouble(curCalc.substring(k+1, curCalc.length()));
        }
        return result;
    }

    static String getLastResult(){
        int countSpace = 0;
        for(int i = 0; i < HashField.getHashField(0).getText().length(); i++) {
            if(HashField.getHashField(0).getText().charAt(i) == ' ') countSpace++;
            if(countSpace == 4) return HashField.getHashField(0).getText().substring(i + 1, HashField.getHashField(0).getText().length());
        }
        System.out.println(HashField.getHashField(0).getText().substring(7 + 1, HashField.getHashField(0).getText().length()));
        return "0";
    }
}