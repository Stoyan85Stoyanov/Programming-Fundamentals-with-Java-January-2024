package ProgrammingFundamentalsFinalExamPreparation;

import java.util.Scanner;

public class _01_SecretChat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String message = scanner.nextLine();
        StringBuilder messageBuilder = new StringBuilder(message);
        String command = scanner.nextLine();

        while (!command.equals("Reveal")) {
             String [] commandParts = command.split(":\\|:");
             String commandName = commandParts[0];

            switch (commandName){
                case "InsertSpace":
                    int index = Integer.parseInt(commandParts[1]);
                    messageBuilder.insert(index, " ");
                    System.out.println(messageBuilder);
                    break;

                case "Reverse":
                    String substring = commandParts[1];
                    if (messageBuilder.toString().contains(substring)) {

                    int indexOfSubstring = messageBuilder.indexOf(substring);
                    messageBuilder.delete(indexOfSubstring, messageBuilder.length());

                    String reverseSubstring = new StringBuilder(substring).reverse().toString();
                    messageBuilder.append(reverseSubstring);
                        System.out.println(messageBuilder);

                    }else {
                        System.out.println("error");
                    }
                    break;

                case "ChangeAll":
                    String textReplace = commandParts[1];
                    String replacementText = commandParts[2];
                    messageBuilder = new StringBuilder(messageBuilder.toString().replaceAll(textReplace, replacementText));
                    System.out.println(messageBuilder);
                    break;

            }
            command = scanner.nextLine();
        }
        System.out.printf("You have a new text message: %s%n", messageBuilder);
    }
}
