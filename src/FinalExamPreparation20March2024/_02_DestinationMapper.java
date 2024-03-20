package FinalExamPreparation20March2024;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _02_DestinationMapper {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String allDestinations = scanner.nextLine();

        String regex = "([=\\/])(?<destination>[A-Z][A-Za-z]{2,})\\1";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(allDestinations);

        List<String> validDestinations = new ArrayList<>();

        while (matcher.find()) {
            validDestinations.add(matcher.group("destination"));
        }

        System.out.println("Destinations: " + String.join(", ", validDestinations));

        int travelPoints = 0;
        for (String destination : validDestinations) {
            travelPoints += destination.length();
        }
        System.out.printf("Travel Points: %d%n", travelPoints);
    }
}
