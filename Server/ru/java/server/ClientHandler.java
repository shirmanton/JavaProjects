package ru.java.server;

import ru.java.server.operation.CalcExpression;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

class ClientHandler implements Runnable {

    private static Socket clientDialog;

    ClientHandler(Socket client) {
        ClientHandler.clientDialog = client;
    }

    @Override
    public void run() {

        try {
            DataOutputStream out = new DataOutputStream(clientDialog.getOutputStream());
            System.out.println("DataOutputStream  created");
            DataInputStream in = new DataInputStream(clientDialog.getInputStream());
            System.out.println("DataInputStream created");
            while (!clientDialog.isClosed()) {
                System.out.println("Server reading from channel");
                String entry = in.readUTF();
                System.out.println("READ from clientDialog message: " + entry);
                System.out.println("Server try writing to channel");
                String result = CalcExpression.calcExpression(entry);
                out.writeUTF(result);
                out.flush();
                System.out.println("Server wrote message '" + result + "' to clientDialog.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}