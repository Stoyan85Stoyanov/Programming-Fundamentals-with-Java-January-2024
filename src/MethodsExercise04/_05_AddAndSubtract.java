package MethodsExercise04;

import java.util.Scanner;

public class _05_AddAndSubtract {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());

        int sum = sumTwoNumbers(firstNumber, secondNumber);
        int result = subtractTwoNumbers(sum, thirdNumber);

        System.out.println(result);

    }

    public static int sumTwoNumbers(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public static int subtractTwoNumbers(int sum, int thirdNumber) {
        return sum - thirdNumber;
    }
}
