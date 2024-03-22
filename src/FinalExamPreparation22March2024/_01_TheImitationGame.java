package FinalExamPreparation22March2024;

import java.util.Scanner;

public class _01_TheImitationGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder message = new StringBuilder(input);

        String command = scanner.nextLine();
        while (!command.equals("Decode")) {

            String[] commandParts = command.split("\\|");
            String commandName = commandParts[0];

            switch (commandName) {

                case "Move":
                    int numberOfLettersToMove = Integer.parseInt(commandParts[1]);
                    String substringToMove = message.substring(0, numberOfLettersToMove);
                    message.delete(0, numberOfLettersToMove);
                    message.append(substringToMove);
                    break;

                case "Insert":
                    int index = Integer.parseInt(commandParts[1]);
                    String value = commandParts[2];
                    message.insert(index, value);
                    break;

                case "ChangeAll":
                    String textToReplace = commandParts[1];
                    String replacement = commandParts[2];
                    String currentMessage = message.toString();
                    String newMessage = currentMessage.replace(textToReplace, replacement);
                    message = new StringBuilder(newMessage);
                    break;
                }

            command = scanner.nextLine();
        }

        System.out.printf("The decrypted message is: %s%n", message);
    }
}
