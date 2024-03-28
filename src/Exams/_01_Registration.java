package Exams;

import java.util.Scanner;

public class _01_Registration {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userName = scanner.nextLine();
        String command = scanner.nextLine();

        while (!command.equals("Registration")) {
            String[] commandParts = command.split("\\s+");
            String commands = commandParts[0];

            if (commands.equals("Letters")) {
                String commandsLowerUpper = commandParts [1];

                if (commandsLowerUpper.equals("Upper"))  {
                    userName = userName.toUpperCase();
                } else if (commandsLowerUpper.equals("Lower")) {
                    userName = userName.toLowerCase();
                }
                System.out.println(userName);


            } else if (commands.equals("Reverse")) {
                int startIndex = Integer.parseInt(commandParts [1]);
                int endIndex = Integer.parseInt(commandParts [2]);

                if ((startIndex >= 0 && startIndex < userName.length()) && (endIndex >= 0 && endIndex < userName.length()) )  {
                    String subst = userName.substring(startIndex, endIndex + 1);

                    StringBuilder sb = new StringBuilder(subst).reverse();

                    System.out.println(sb);
                }


            } else if (commands.equals("Substring")) {
                String substring = commandParts[1];

                if (userName.contains(substring)) {
                    String replacement = "";
                    userName = userName.replace(substring, replacement);
                    System.out.println(userName);

                } else {
                    System.out.printf("The username %s doesn't contain %s.%n", userName, substring);
                }


            } else if (commands.equals("Replace")){
                String textToReplace = commandParts[1];
                String replacement = "-";

                userName = userName.replace(textToReplace, replacement);
                System.out.println(userName);

            } else if (!commands.equals("IsValid ")) {
                String character = commandParts[1];

                if (userName.contains(character)) {
                    System.out.println("Valid username.");

                } else {
                    System.out.println(character + " must be contained in your username.");
                }
            }
            command = scanner.nextLine();
        }
    }
}

