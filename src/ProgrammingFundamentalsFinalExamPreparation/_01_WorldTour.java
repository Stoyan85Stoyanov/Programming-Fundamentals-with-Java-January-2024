package ProgrammingFundamentalsFinalExamPreparation;

import java.util.Scanner;

public class _01_WorldTour {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stops = scanner.nextLine();
        String command = scanner.nextLine();

        while (!command.equals("Travel")) {

               String [] commandParts = command.split(":");
               String commandName = commandParts [0];

               switch (commandName){
                   case "Add Stop":
                       int index = Integer.parseInt(commandParts [1]);
                       String stopName = commandParts [2];

                       if (isValidIndex(index, stops)){
                        String firstHalf = stops.substring(0, index);
                        String secondHalf = stops.substring(index);

                        stops = firstHalf + stopName + secondHalf;
                       }

                       break;

                   case "Remove Stop":
                       int startIndex = Integer.parseInt(commandParts [1]);
                       int endIndex = Integer.parseInt(commandParts [2]);

                       if (isValidIndex(startIndex, stops) && isValidIndex(endIndex, stops)) {
                           stops = stops.substring(0, startIndex) + stops.substring(endIndex + 1);
                       }
                       break;

                   case "Switch":
                       String oldStop = commandParts [1];
                       String newStop = commandParts [2];

                       if (stops.contains(oldStop)){
                          stops = stops.replace(oldStop, newStop);
                       }
                       break;
               }
            System.out.println(stops);

            command = scanner.nextLine();
        }
        System.out.printf("Ready for world tour! Planned stops: %s", stops);
        System.out.println();
    }
    public static boolean isValidIndex (int index, String stop) {

        return index >= 0 && index < stop.length();
    }
}
