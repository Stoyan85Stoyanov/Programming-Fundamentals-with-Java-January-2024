package MethodsExercise04;

import java.util.Scanner;

public class _01_SmallestOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());

        getMinNumber(firstNumber, secondNumber, thirdNumber);

    }

    private static void getMinNumber(int firstNumber, int secondNumber, int thirdNumber) {

        System.out.println(Math.min(Math.min(firstNumber, secondNumber), thirdNumber));
    }
}





