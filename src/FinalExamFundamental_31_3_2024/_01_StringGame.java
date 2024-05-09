package FinalExamFundamental_31_3_2024;

import java.util.Scanner;

public class _01_StringGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String command = scanner.nextLine();

        while (!command.equals("Done")) {

            String[] inputs = command.split("\\s+");

            switch (inputs[0]) {

                case "Change":
                    String oldStop = inputs [1];
                    String newStop = inputs [2];
                    if (input.contains(oldStop)){
                        input = input.replace(oldStop, newStop);
                        System.out.println(input);
                    }

                    break;

                case "Includes":
                    String substring = inputs[1];

                    if (input.contains(substring)) {
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }
                    break;

                case "End":
                    String substrings = inputs[1];

                    if (input.endsWith(substrings)) {
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }
                    break;

                case "Uppercase":
                    input = input.toUpperCase();
                    System.out.println(input);
                    break;

                case "FindIndex":
                    String ch = inputs[1];
                    int nextMatch = input.indexOf(ch);
                    System.out.println(nextMatch);
                    break;

                case "Cut":
                       int startIndex = Integer.parseInt(inputs [1]);
                       int count = Integer.parseInt(inputs [2]);

                    int endIndex = startIndex+count;
                    String substringForRemove = input.substring(startIndex, endIndex);

                    System.out.println(substringForRemove);
                    break;

            }
            command = scanner.nextLine();
        }
    }
}

