package ru.java.calculator.controller.operation.arithmetic;

public class Minus extends Operation {

    public Minus(double x, double y) {
        super(x, y);
    }

    @Override
    public double calculate() {
        return super.x - super.y;
    }
}