package ProgrammingFundamentalsFinalExamPreparation;

import java.util.Scanner;

public class _01_WorldTour_01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stops = scanner.nextLine();

        while (true){
            String commands = scanner.nextLine();
            if (commands.equals("Travel")) {
                break;
            }
            String [] commandParts = commands.split(":");
            String command = commandParts[0];

            switch (command) {
                case "Add Stop":
                    int index = Integer.parseInt(commandParts[1]);
                    String stop = commandParts[2];
                    if (isValidIndex(index, stops)) {
                        String left = stops.substring(0, index);
                        String right = stops.substring(index);

                        stops = left + stop + right;
                    }
                    break;

                case "Remove Stop":
                    int startIndex = Integer.parseInt(commandParts[1]);
                    int endIndex = Integer.parseInt(commandParts[2]);

                    if (isValidIndex(startIndex, stops) && isValidIndex(endIndex + 1, stops)) {
                        String left = stops.substring(0, startIndex);
                        String right = stops.substring(endIndex + 1);

                        stops = left + right;
                    }
                    break;

                case "Switch":
                    String oldString = commandParts[1];
                    String newString = commandParts[2];

                        stops = stops.replace(oldString, newString);

                    break;
            }
            System.out.println(stops);
        }
        System.out.printf("Ready for world tour! Planned stops: %s%n", stops);
    }

    private static boolean isValidIndex(int index, String stops) {
        return index >=0 && index <= stops.length();
    }
}

