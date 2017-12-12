package ru.java.calculator.controller.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ru.java.calculator.controller.Controller;

public class CleanButtonListener implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        Controller.getCalcField().setText("0");
    }
}