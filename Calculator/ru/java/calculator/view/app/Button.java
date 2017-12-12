package ru.java.calculator.view.app;

import javax.swing.*;
import ru.java.calculator.controller.listener.*;

class Button {

    private JButton[] buttonNum = new JButton[10];

    private JButton[] buttonOperation = new JButton[7];

    private int[][] coordinateNum = {{20, 300}, {20, 240}, {80, 240}, {140, 240}, {20, 180},
                                     {80, 180}, {140, 180}, {20, 120}, {80, 120}, {140, 120}};

    private int[][] coordinateOperation = {{140, 300}, {200, 300}, {200, 240}, {200, 180},
                                           {200, 120}, {260, 240}, {260, 120}};

    private char[] symbolOperation = {'.', '+', '-', '*', '/', '=', 'C'};

    Button(WindowApp windowApp) {
        for(int i = 0; i < 10; i++)
            windowApp.add(getButtonNum(i));
        for(int i = 0; i < 7; i++)
            windowApp.add(getButtonOperation(i));
    }

    private JButton getButtonNum(int num) {
        if (buttonNum[num] == null) {
            buttonNum[num] = new JButton(Integer.toString(num));
            if (num == 0)
                buttonNum[num].setBounds(coordinateNum[num][0], coordinateNum[num][1], 105, 45);
            else
                buttonNum[num].setBounds(coordinateNum[num][0], coordinateNum[num][1], 45, 45);
            buttonNum[num].addActionListener(new CharButtonListener((char)(num + 48)));
        }
        return buttonNum[num];
    }

    private JButton getButtonOperation(int num) {
        if (buttonOperation[num] == null) {
            buttonOperation[num] = new JButton(Character.toString(symbolOperation[num]));
            if (num == 5)
                buttonOperation[num].setBounds(coordinateOperation[num][0], coordinateOperation[num][1], 45, 105);
            else
                buttonOperation[num].setBounds(coordinateOperation[num][0], coordinateOperation[num][1], 45, 45);
            switch (num){
                case(0):
                    buttonOperation[num].addActionListener(new CharButtonListener(symbolOperation[num]));
                    break;
                case(5):
                    buttonOperation[num].addActionListener(new CalcButtonListener());
                    break;
                case(6):
                    buttonOperation[num].addActionListener(new CleanButtonListener());
                    break;
                default:
                    buttonOperation[num].addActionListener(new SignButtonListener(symbolOperation[num]));
                    break;
            }
        }
        return buttonOperation[num];
    }
}