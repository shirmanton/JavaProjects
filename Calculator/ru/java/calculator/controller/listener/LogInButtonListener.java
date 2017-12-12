package ru.java.calculator.controller.listener;

import ru.java.calculator.controller.Controller;
import ru.java.calculator.view.View;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class LogInButtonListener implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        if ((Controller.getUserName()[0].equals(Controller.getUserName()[1])) && (Controller.getUserPassword()[0].equals(Controller.getUserPassword()[1])))
            View.getWindowApp(); //launch application window
        else JOptionPane.showMessageDialog(View.getWindowLogIn(), "Wrong login or password");
    }
}