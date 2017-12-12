package ru.java.calculator.controller.client;

import ru.java.calculator.controller.Controller;
import java.io.*;
import java.net.Socket;

public class Client {

    private static DataOutputStream oos = null;
    private static DataInputStream ois = null;

    public static String sentMessage() throws InterruptedException {

        String message;

        String result = "0";

        try
        {
            if(!isActiveSocket()) connectSocket();
            System.out.println("Client connected to socket.");
            try {
                message = Controller.getCalcField().getText();
            } catch (NullPointerException a) {
                message = "0";
            }
            oos.writeUTF(message);
            oos.flush();
            System.out.println("Client sent message " + message + " to server.");
            result = ois.readUTF();
            System.out.println("READ from serverDialog message: " + result);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return result;
    }

    private static void connectSocket() throws IOException {
        Socket socket = new Socket("localhost", 3345);
        oos = new DataOutputStream(socket.getOutputStream());
        ois = new DataInputStream(socket.getInputStream());
    }

    private static boolean isActiveSocket() {
        if(oos == null || ois == null) return false;
        else return true;
    }
}