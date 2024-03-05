package ProgrammingFundamentalsFinalExam02;

import java.util.Scanner;

public class _01_WorldTour {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder stops = new StringBuilder(scanner.nextLine());
        String input = scanner.nextLine();

        while (!input.equals("Travel")) {
            String[] commandParts = input.split(":");
            String commandName = commandParts[0];

            switch (commandName) {
                case "Add Stop":
                    int index = Integer.parseInt(commandParts[1]);
                    String stopInsert = commandParts[2];
                    if (invalidIndex(index, stops)) {
                        stops.insert(index, stopInsert);
                    }
                    System.out.println(stops);
                    break;

                case "Remove Stop":
                    int removeStartIndex = Integer.parseInt(commandParts[1]);
                    int removeEndIndex = Integer.parseInt(commandParts[2]);
                    if (invalidIndex(removeStartIndex, stops)
                            && invalidIndex(removeEndIndex, stops)) {
                        stops.delete(removeStartIndex, removeEndIndex + 1);
                    }
                    System.out.println(stops);
                    break;

                case "Switch":
                    String oldString = commandParts[1];
                    String newString = commandParts[2];
                    String destinationAsString = stops.toString();
                    destinationAsString = destinationAsString.replace(oldString,newString);
                    stops = new StringBuilder(destinationAsString);
                    System.out.println(stops);
                    break;
            }

            input = scanner.nextLine();
        }

        System.out.printf("Ready for world tour! Planned stops: %s%n", stops);
    }

    public static boolean invalidIndex(int index, StringBuilder text) {
        if (index >= 0 && index < text.length()) {
            return true;
        }
        return false;
    }
}
