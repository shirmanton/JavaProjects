package ru.java.server.operation.arithmetic;

public class Plus extends Operation {

    public Plus(double x, double y) {
        super(x, y);
    }

    @Override
    public double calculate() {
        return super.x + super.y;
    }
}