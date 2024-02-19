package patterns.structural.wrappers.decorator.task.impl;

import patterns.structural.wrappers.decorator.task.Calculable;

/**
 * Object of calculator closed for any changes(final);
 */
public final class Calculator implements Calculable {
    private double result;

    public Calculator() {
        this.result = 0;
    }

    @Override
    public void sum(double a, double b) {
        double tempResult = a + b;
        result+= tempResult;
    }

    @Override
    public void multiply(double a, double b) {
        double tempResult = a * b;
        result+= tempResult;
    }

    @Override
    public void divide(double a, double b) {
        try {
            double tempResult = a / b;
            result+= tempResult;
        } catch (ArithmeticException e) {
            throw new ArithmeticException("Divide by zero exception");
        }
    }

    @Override
    public void subtraction(double a, double b) {
        double tempResult = a - b;
        result+= tempResult;
    }

    @Override
    public double result() {
        System.out.printf("Result: %s%n", result);
        return result;
    }

    @Override
    public void clear() {
        this.result = 0;
    }

}
