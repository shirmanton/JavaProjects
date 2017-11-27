package ru.java.calculator.model;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.File;

public class Model {

    private static String userName;

    private static String userPassword;

    private static File fileUP = new File("src//ru//java//calculator//model//data", "user_password.txt");

    private static File fileDB = new File("src//ru//java//calculator//model//data", "data_base.xls");

    public static String getUserName() {
        if (userName == null) {
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(fileUP)))) {
                userName = reader.readLine();
            } catch (IOException e) {
                System.out.println("Error reading from the login and password file");
            }
        }
        return userName;
    }

    public static String getUserPassword() {
        if (userPassword == null) {
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(fileUP)))) {
                reader.readLine();
                userPassword = reader.readLine();
            } catch (IOException e) {
                System.out.println("Error reading from the login and password file");
            }
        }
        return userPassword;
    }
}