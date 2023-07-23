package calculator.operations;

import calculator.MathOperator;

public class DivideOperator implements MathOperator {

    private MathOperator nextOperator;

    @Override
    public void setNext(MathOperator nextOperator) {
        this.nextOperator = nextOperator;
    }

    @Override
    public double calculate(double num1, double num2, String operator) {
        if(operator.equals("-")){
            return num1-num2;
        } else if(nextOperator != null){
            return nextOperator.calculate(num1, num2, operator);
        } else {
            throw new UnsupportedOperationException("Unsuported Operation " + operator);
        }
    }
}
