package ru.java.calculator.controller.handler;

import java.io.*;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileHandler implements Runnable {

    private File file = null;

    private ArrayList<String> array = new ArrayList<>();

    private String inputString;

    private Thread thread = null;

    public Thread getThread() {
        return thread;
    }

    public FileHandler() {
        file = new File(System.getProperty("user.dir"));
        if (file.isDirectory()) {
            for (File item : file.listFiles()) {
                if (!item.isDirectory())
                    array.add(item.getName());
            }
        }
    }

    public void writeFile(String inputString) {
        thread = new Thread(this, "Thread write file");
        this.inputString = inputString;
    }

    @Override
    public void run() {
        int num = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(array.get(array.size() - 1)))) {
            while ((br.readLine()) != null) {
                num++;
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        if (num < 10) {
            try (FileWriter writer = new FileWriter(array.get(array.size() - 1), true)) {
                writer.write(inputString);
                writer.write(System.getProperty("line.separator"));
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        } else {
            Pattern pat = Pattern.compile("[0-9]+(.[0-9]+)?");
            Matcher matcher = pat.matcher(array.get(array.size() - 1));
            String numberString = null;
            while (matcher.find()) {
                numberString = (matcher.group());
            }
            int numInt = Integer.parseInt(numberString);
            numInt++;
            File newFile = new File(System.getProperty("user.dir"), String.format("data_base-%d.txt", numInt));
            try {
                newFile.createNewFile();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
            try (FileWriter writer = new FileWriter(String.format("data_base-%d.txt", numInt), true)) {
                writer.write(inputString);
                writer.write(System.getProperty("line.separator"));
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
