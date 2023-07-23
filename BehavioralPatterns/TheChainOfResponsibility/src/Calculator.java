import calculator.MathOperator;
import calculator.operations.AddOperator;
import calculator.operations.DivideOperator;
import calculator.operations.MultiplyOperator;
import calculator.operations.SubtractOperator;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        /*
        The Chain Of Responsibility Pattern the orders of which the handlers
        are linked together determines the sequence in which they will be
        used to handle the request
         */


        double number1 = 20;
        double number2 = 5;
        String opperand = "+";

        MathOperator add = new AddOperator();
        MathOperator div = new DivideOperator();
        MathOperator mul = new MultiplyOperator();
        MathOperator sub = new SubtractOperator();

        add.setNext(div);
        div.setNext(mul);
        mul.setNext(sub);

        double sum = add.calculate(number1, number2, opperand);

        System.out.println(sum);

    }
}