package ru.java.server.operation.arithmetic;

public abstract class Operation {

    double x;

    double y;

    Operation(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double calculate() {
        return 0;
    }
}