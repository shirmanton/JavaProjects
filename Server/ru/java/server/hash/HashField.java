package ru.java.server.hash;

import javax.swing.*;

public class HashField {

    private static JTextField[] hashField = new JTextField[6];

    HashField(WindowHash windowHash) {
        for(int i =0; i < 6; i++)
            windowHash.add(getHashField(i));
    }

    public static JTextField getHashField(int i) {
        if (hashField[i]  == null) {
            hashField[i] = new JTextField();
            hashField[i].setEditable(false);
            hashField[i].setBounds(40, 25 + 55 * i, 250, 45);
        }
        return hashField[i];
    }
}
