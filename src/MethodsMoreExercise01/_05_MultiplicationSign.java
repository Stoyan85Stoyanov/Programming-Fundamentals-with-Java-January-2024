package MethodsMoreExercise01;

import java.util.Scanner;

public class _05_MultiplicationSign {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());

        printMultiplicationSign(firstNumber, secondNumber, thirdNumber);

    }

    public static void printMultiplicationSign(int firstNumber, int secondNumber, int thirdNumber) {

        if (firstNumber == 0 || secondNumber == 0 || thirdNumber == 0) {
            System.out.println("zero");

        } else if ((firstNumber > 0 && secondNumber > 0 && thirdNumber > 0)
                || (firstNumber < 0 && secondNumber < 0 && thirdNumber > 0)
                || (firstNumber < 0 && secondNumber > 0 && thirdNumber < 0)
                || (firstNumber > 0 && secondNumber < 0 && thirdNumber < 0)) {
            System.out.println("positive");

        } else {
            System.out.println("negative");

        }
    }
}



