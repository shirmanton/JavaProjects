package ru.java.calculator.controller.listener;

import ru.java.calculator.controller.Controller;
import ru.java.calculator.controller.client.Client;
import ru.java.calculator.controller.handler.FileHandler;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcButtonListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) throws NumberFormatException {

        double result = 0;
        try {
            result = Double.parseDouble(Client.sentMessage());
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }
        FileHandler fileHandler = new FileHandler();
        try{
            fileHandler.writeFile(Controller.getCalcField().getText() + " = " + Double.toString(result));
            fileHandler.getThread().join();
        } catch (InterruptedException ignored) {
        }
        if(result % 1 == 0)
            Controller.getCalcField().setText(Integer.toString((int)result));
        else Controller.getCalcField().setText(Double.toString(result));
    }
}