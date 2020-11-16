package calculator.model;

public class Calculator {
    public double getAnswer(double num1, double num2, char operation) {
        Answer eq;
        double result;
        switch(operation) {
            case '+':
                eq = new Addition();
                result = eq.getResult(num1, num2);
                break;
            case '-':
                eq = new Subtraction();
                result = eq.getResult(num1, num2);
                break;
            case '*':
                eq = new Multiplication();
                result = eq.getResult(num1, num2);
                break;
            case '/':
                eq = new Division();
                result = eq.getResult(num1, num2);
                break;
            default:
                return 0;
        }
        return result;
    }
}