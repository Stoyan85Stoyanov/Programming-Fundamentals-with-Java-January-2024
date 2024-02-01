package MethodsLab04;

import java.util.Arrays;
import java.util.Scanner;

public class _10_MultiplyEvensByOdds {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Math.abs(Integer.parseInt(scanner.nextLine()));

        System.out.println(multiply(number));
    }

    public static int multiply(int number) {
        return evenSum(number) * oddSum(number);
    }

    public static int evenSum(int number) {
        String intToString = Integer.toString(number);

        int[] arr = Arrays.stream(intToString.split(""))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sum = 0;
        for (int number1 : arr) {
            if (number1 % 2 == 0) {
                sum += number1;
            }
        }

        return sum;
    }

    public static int oddSum(int number) {
        String intToString = Integer.toString(number);

        int[] arr = Arrays.stream(intToString.split(""))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sum = 0;
        for (int number2 : arr) {
            if (number2 % 2 != 0) {
                sum += number2;
            }
        }

        return sum;
    }
}
