package calculator.model;

public class Subtraction implements Answer {
    @Override
    public double getResult(double num1, double num2) {
        return num1 - num2;
    }
}
