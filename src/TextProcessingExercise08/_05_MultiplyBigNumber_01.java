package TextProcessingExercise08;

import java.util.Scanner;

public class _05_MultiplyBigNumber_01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String numbers = scanner.nextLine();
        int multiplier = Integer.parseInt(scanner.nextLine());

        StringBuilder bigNumber = new StringBuilder();

        int remainder = 0;
        for (int number = numbers.length() - 1; number >= 0; number--) {
            int digit = Integer.parseInt(String.valueOf(numbers.charAt(number)));
            int product = digit * multiplier + remainder;

            if (number == 0) {
                bigNumber.insert(0, product);
            } else {
                int digitToAdd = product % 10;

                remainder = product / 10;
                bigNumber.insert(0, digitToAdd);
            }
        }

        while (bigNumber.charAt(0) == '0' && bigNumber.length() > 1) {
            bigNumber.deleteCharAt(0);
        }

        System.out.printf("%s%n",bigNumber);
    }
}
