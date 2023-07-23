package calculator;

public interface MathOperator {

    void setNext(MathOperator nextOperator);
    double calculate(double num1, double num2, String operator);
}
