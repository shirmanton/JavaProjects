package ru.java.server.operation.arithmetic;

public class Divide extends Operation {

    public Divide(double x, double y) {
        super(x, y);
    }

    @Override
    public double calculate() {
        return super.x / super.y;
    }
}