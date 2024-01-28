package DataTypesAndVariablesMoreExercise01;

import java.util.Scanner;

public class _03_FloatingEquality {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number1 = Double.parseDouble(scanner.nextLine());
        double number2 = Double.parseDouble(scanner.nextLine());
        double eps = 0.000001;

        boolean isTrue = (Math.abs(number1 - number2) <= eps);

        if (isTrue) {
            System.out.println("True");

        }else {
            System.out.println("False");
        }
    }
}
