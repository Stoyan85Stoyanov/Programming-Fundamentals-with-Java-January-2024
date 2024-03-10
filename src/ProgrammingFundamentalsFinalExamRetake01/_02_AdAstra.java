package ProgrammingFundamentalsFinalExamRetake01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _02_AdAstra {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        List<String> output = new ArrayList<>();
        Pattern pattern = Pattern.compile("([#|])(?<name>[A-Za-z ]+)\\1(?<date>\\d{2}/\\d{2}/\\d{2})\\1(?<calories>\\d+)\\1");
        Matcher matcher = pattern.matcher(text);
        int totalCalories = 0;

        while (matcher.find()) {
            String name = matcher.group("name");
            String date = matcher.group("date");
            String calories = matcher.group("calories");

            output.add(String.format("Item: %s, Best before: %s, Nutrition: %s",name ,date ,calories));

            totalCalories += Integer.parseInt(matcher.group("calories"));
        }
        int totalDays = totalCalories / 2000;

        System.out.printf("You have food to last you for: %d days!%n", totalDays);
        output.forEach(System.out::println);
    }
}
