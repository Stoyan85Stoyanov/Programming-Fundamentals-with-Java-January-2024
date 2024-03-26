package ExamPreparation20March2024;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _02_DestinationMapper {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String places  = scanner.nextLine();

        String regex = "([=/])(?<places>[A-Z][a-zA-Z]{2,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(places);

        ArrayList<String> destinations = new ArrayList<>();
        int travelPoints = 0;

        while(matcher.find()) {

            destinations.add(matcher.group("places"));
            travelPoints = travelPoints + matcher.group("places").length();
        }

        System.out.println("Destinations: " + String.join(", ", destinations));
        System.out.printf("Travel Points: %d%n", travelPoints);
    }
}
