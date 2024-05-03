package ExamPreparation20March2024;

import java.util.Scanner;

public class _01_Registration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userName = scanner.nextLine();
        String command = scanner.nextLine();

        while (!command.equals("Registration")) {
            String[] commandParts = command.split("\\s+");
            String commandName = commandParts[0];

            switch (commandName) {

                case "Letters":
                    String upperOrLower = commandParts[1];

                    if (upperOrLower.equals("Upper")) {
                        userName = userName.toUpperCase();

                    } else if (upperOrLower.equals("Lower")) {
                        userName = userName.toLowerCase();
                    }

                    System.out.println(userName);
                    break;

                case "Reverse":
                    int startIndex = Integer.parseInt(commandParts[1]);
                    int endIndex = Integer.parseInt(commandParts[2]);

                    boolean validStartIndex = startIndex >= 0 && startIndex < userName.length();
                    boolean validEndIndex = endIndex >= 0 && endIndex < userName.length();

                    if (validStartIndex && validEndIndex) {

                        String subst = userName.substring(startIndex, endIndex + 1);

                        StringBuilder sb = new StringBuilder(subst).reverse();

                        System.out.println(sb);
                    }
                    break;


                case "Substring":
                    String substring = commandParts[1];

                    if (userName.contains(substring)) {
                        String replacement = "";
                        userName = userName.replace(substring, replacement);
                        System.out.println(userName);

                    } else {
                        System.out.printf("The username %s doesn't contain %s.%n", userName, substring);
                    }
                    break;

                case "Replace":
                    String textToReplace = commandParts[1];
                    String replacement = "-";

                    userName = userName.replace(textToReplace, replacement);
                    System.out.println(userName);
                    break;

                case "IsValid":
                    String character = commandParts[1];

                    if (userName.contains(character)) {
                        System.out.println("Valid username.");

                    } else {
                        System.out.println(character + " must be contained in your username.");
                    }
                    break;
            }
            command = scanner.nextLine();
        }
    }
}
