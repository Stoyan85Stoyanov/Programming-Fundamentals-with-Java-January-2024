package ProgrammingFundamentalsFinalExamPreparation;

import java.util.Scanner;

public class _01_TheImitationGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder message = new StringBuilder(scanner.nextLine());

        String command = scanner.nextLine();

        while (!command.equals("Decode")) {
              String [] commandParts = command.split("\\|");
              String commandName = commandParts [0];
              switch (commandName){
                  case "Move":
                      move(message, Integer.parseInt(commandParts [1]));
                      break;

                  case "Insert":
                      insert(message, Integer.parseInt(commandParts [1]), commandParts [2]);
                      break;

                  case "ChangeAll":
                      changeAll(message, commandParts [1], commandParts [2]);
                      break;

              }
            command = scanner.nextLine();
        }
        System.out.println("The decrypted message is: " + message);
    }

    private static void move(StringBuilder message, int length) {
        String firstPart = message.substring(0, length);
        message.replace(0, length, "");
        message.append(firstPart);

    }
    private static void insert(StringBuilder message, int index, String substring) {
        message.insert(index, substring);
    }

    private static void changeAll(StringBuilder message, String substring, String replacement) {
        int nextMatch = message.indexOf(substring);
        while (nextMatch != -1){
            message.replace(nextMatch, nextMatch + substring.length(), replacement);

            nextMatch = message.indexOf(substring, nextMatch);
        }
    }
}
