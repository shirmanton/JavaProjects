package ru.java.calculator.controller.operation.arithmetic;

public class Multiply extends Operation {

    public Multiply(double x, double y) {
        super(x, y);
    }

    @Override
    public double calculate() {
        return super.x * super.y;
    }
}