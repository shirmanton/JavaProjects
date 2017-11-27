package ru.java.calculator.controller.operation.dataexel;

public class DataModel {

    private String time;

    private String expression;

    private String result;

    public DataModel() {
    }

    public DataModel(String time, String expression, String result) {
        this.time = time;
        this.expression = expression;
        this.result = result;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}