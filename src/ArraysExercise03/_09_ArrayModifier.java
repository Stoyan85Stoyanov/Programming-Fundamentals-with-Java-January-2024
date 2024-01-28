package ArraysExercise03;

import java.util.Arrays;
import java.util.Scanner;

public class _09_ArrayModifier {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        String command = scanner.nextLine();
        while (!command.equals("end")) {

            if (command.contains("swap")) {

                int firstIndex = Integer.parseInt(command.split(" ")[1]);
                int secondIndex = Integer.parseInt(command.split(" ")[2]);

                int firstIndexNumber = numbers[firstIndex];
                int secondIndexNumber = numbers[secondIndex];

                numbers[firstIndex] = secondIndexNumber;
                numbers[secondIndex] = firstIndexNumber;

            } else if (command.contains("multiply")) {

                int firstIndex = Integer.parseInt(command.split(" ")[1]);
                int secondIndex = Integer.parseInt(command.split(" ")[2]);

                int firstIndexNumber = numbers[firstIndex];
                int secondIndexNumber = numbers[secondIndex];

                int product = firstIndexNumber * secondIndexNumber;

                numbers[firstIndex] = product;

            } else {

                for (int position = 0; position <= numbers.length - 1; position++) {
                    numbers[position]--;
                }
            }

            command = scanner.nextLine();
        }

        for (int position = 0; position < numbers.length; position++) {

            if (position == numbers.length - 1) {
                System.out.print(numbers[position]);

            } else {
                System.out.print(numbers[position] + ", ");
            }
        }
    }
}


