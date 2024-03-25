package ProgrammingFundamentalsFinalExam05;

import java.util.Scanner;

public class _01_ActivationKeys {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String activationKey = scanner.nextLine();
        String commandInput = scanner.nextLine();

        while (!commandInput.equals("Generate")) {

            String [] commandParts = commandInput.split(">>>");
            String commandName = commandParts[0];

            switch(commandName) {

                case "Contains":
                    String subString = commandParts[1];
                    if (activationKey.contains(subString)) {
                        System.out.printf("%s contains %s%n", activationKey, subString);
                    } else {
                        System.out.println("Substring not found!");
                    }
                    break;

                case "Flip":
                    String type = commandParts[1];
                    int startIndexReplace = Integer.parseInt(commandParts[2]);
                    int endIndexReplace = Integer.parseInt(commandParts[3]);

                    String textReplace = activationKey.substring(startIndexReplace, endIndexReplace);
                    String newText = "";

                    if (type.equals("Upper")) {
                        newText = textReplace.toUpperCase();
                    } else if (type.equals("Lower")) {
                        newText = textReplace.toLowerCase();
                    }

                    activationKey = activationKey.replace(textReplace, newText);
                    System.out.println(activationKey);
                    break;

                case "Slice":
                    int startIndex = Integer.parseInt(commandParts[1]);
                    int endIndex = Integer.parseInt(commandParts[2]);

                    StringBuilder sbString = new StringBuilder(activationKey);
                    sbString.delete(startIndex, endIndex);
                    activationKey = sbString.toString();

                    System.out.println(activationKey);
                    break;
            }
            commandInput = scanner.nextLine();
        }
        System.out.printf("Your activation key is: %s%n", activationKey);
    }
}
