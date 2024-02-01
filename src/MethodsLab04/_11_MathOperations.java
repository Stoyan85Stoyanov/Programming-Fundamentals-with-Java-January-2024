package MethodsLab04;

import java.text.DecimalFormat;
import java.util.Scanner;

public class _11_MathOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int secondNumber = Integer.parseInt(scanner.nextLine());

        DecimalFormat df = new DecimalFormat("0.##");

        double result = calculation(operator, firstNumber, secondNumber);

        System.out.println(df.format(result));
    }

    public static double calculation(String operator ,int firstNum, int secondNum){
        double sumResult = 0;

        switch (operator) {
            case "+":
                sumResult = firstNum + secondNum;
                break;

            case "-":
                sumResult = firstNum - secondNum;
                break;

            case "*":
                sumResult = firstNum * secondNum;
                break;

            case "/":
                sumResult = firstNum * 1.0 / secondNum;
                break;
        }
        return sumResult;
    }
}

