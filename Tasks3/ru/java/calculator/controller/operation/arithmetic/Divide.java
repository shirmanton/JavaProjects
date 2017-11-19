package ru.java.calculator.controller.operation.arithmetic;

public class Divide extends Operation {

    public Divide(double x, double y) {
        super(x, y);
    }

    @Override
    public double calculate() {
        return super.x / super.y;
    }
}