package MethodsLab04;

import java.util.Scanner;

public class _04_Calculations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String operation = scanner.nextLine();
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());



        switch (operation) {
            case "add":
                sumAndPrint(firstNumber, secondNumber);
                break;

            case "multiply":
                multiplyAndPrint(firstNumber, secondNumber);
                break;

            case "subtract":
                subtractAndPrint(firstNumber, secondNumber);
                break;

            case "divide":
                divideAndPrint(firstNumber, secondNumber);
                break;

        }
    }

    public static void sumAndPrint(int n1, int n2) {
        System.out.println(n1 + n2);
    }
    public static void multiplyAndPrint(int n1, int n2) {
        System.out.println(n1 * n2);
    }
    public static void subtractAndPrint(int n1, int n2) {
        System.out.println(n1 - n2);
    }
    public static void divideAndPrint(int n1, int n2) {
        System.out.println(n1 / n2);

    }
}
