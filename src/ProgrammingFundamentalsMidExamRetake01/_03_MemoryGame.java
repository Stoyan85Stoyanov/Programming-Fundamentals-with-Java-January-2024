package ProgrammingFundamentalsMidExamRetake01;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _03_MemoryGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> sequenceOfElements = Arrays.stream((scanner.nextLine().split("\\s+"))).collect(Collectors.toList());

        String input;
        int moves = 0;

        while (!"end".equals(input = scanner.nextLine())) {

            moves++;

            int[] numbers = Arrays.stream(input.split("\\s+")).mapToInt(Integer::parseInt).toArray();

            if ((numbers[0] == numbers[1]) || (numbers[0] < 0 || numbers[0] >= sequenceOfElements.size()) || (numbers[1] < 0 || numbers[1] >= sequenceOfElements.size())) {
                System.out.println("Invalid input! Adding additional elements to the board");

                sequenceOfElements.add(sequenceOfElements.size() / 2, "-" + moves + "a");
                sequenceOfElements.add(sequenceOfElements.size() / 2, "-" + moves + "a");

            } else {

                if (sequenceOfElements.get(numbers[0]).equals(sequenceOfElements.get(numbers[1]))) {
                    System.out.printf("Congrats! You have found matching elements - %s!%n", sequenceOfElements.get(numbers[0]));

                    sequenceOfElements.remove(Math.max(numbers[0], numbers[1]));
                    sequenceOfElements.remove(Math.min(numbers[0], numbers[1]));

                } else {
                    System.out.println("Try again!");

                }
                if (sequenceOfElements.isEmpty()) {
                    System.out.printf("You have won in %d turns!%n", moves);
                    return;
                }
            }
        }
        System.out.println("Sorry you lose :(");
        System.out.println(String.join(" ", sequenceOfElements));
    }
}






















