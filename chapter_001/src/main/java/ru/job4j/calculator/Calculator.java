package ru.job4j.calculator;

public class Calculator {

    private double result;

    public void add(double first, double second) {
        this.result = first + second;
    }

    public double getResult() {
        return this.result;
    }

    public void substract(double first, double second) {
        this.result = first - second;
    }

    public double getSubstractResult() {
        return this.result;
    }
    public void div(double first, double second) {
        this.result = first / second;
    }

    public double getDivResult() {
        return this.result;
    }

    public void multiply(double first, double second) {
        this.result = first / second;
    }

    public double getMultiplResult() {
        return this.result;
    }
}