package ProgrammingFundamentalsFinalExamRetake03;

import java.util.Scanner;

public class _01_SecretChat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String concealedMessage = scanner.nextLine();
        StringBuilder message = new StringBuilder(concealedMessage);
        String input = scanner.nextLine();

        while (!input.equals("Reveal")) {
            String[] commandParts = input.split(":\\|:");
            String commandName = commandParts[0];

            switch (commandName) {
                case "InsertSpace":
                    int index = Integer.parseInt(commandParts[1]);
                    message.insert(index, " ");
                    System.out.println(message);
                    break;

                case "Reverse":
                    String substring = commandParts[1];

                    if (message.toString().contains(substring)) {
                        int indexSubstring = message.indexOf(substring);

                        message.delete(indexSubstring, indexSubstring + substring.length() + 1);
                        String reversedSubstring = new StringBuilder(substring).reverse().toString();
                        message.append(reversedSubstring);

                        System.out.printf("%s%n",message);
                    } else {
                        System.out.println("error");
                    }
                    break;

                case "ChangeAll":
                    String textReplace = commandParts[1];
                    String replacementText = commandParts[2];
                    message = new StringBuilder(message.toString().replaceAll(textReplace, replacementText));

                    System.out.printf("%s%n",message);
                    break;
            }

            input = scanner.nextLine();
        }

        System.out.printf("You have a new text message: %s%n",message);
    }
}
