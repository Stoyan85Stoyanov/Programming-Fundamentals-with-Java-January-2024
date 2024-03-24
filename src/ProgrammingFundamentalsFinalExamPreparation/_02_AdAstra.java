package ProgrammingFundamentalsFinalExamPreparation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _02_AdAstra {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         String textString = scanner.nextLine();
         String regex  = "(#|\\|)(?<foodName>[A-Za-z\\s]+)\\1(?<expirationDate>[0-9]{2}\\/[0-9]{2}\\/[0-9]{2})\\1(?<calories>[0-9]{1,5})\\1";
         Pattern pattern = Pattern.compile(regex);
         Matcher matcher = pattern.matcher(textString);

         int totalCalories = 0;
         StringBuilder foodsOutput = new StringBuilder();


         while (matcher.find()) {

             String foodName = matcher.group("foodName");
             String expirationDate = matcher.group("expirationDate");
             int calories = Integer.parseInt(matcher.group("calories"));

             totalCalories +=calories;

             String output = String.format("Item: %s, Best before: %s, Nutrition: %d%n", foodName, expirationDate, calories);
             foodsOutput.append(output);
         }

        int days = totalCalories / 2000;
        System.out.printf("You have food to last you for: %d days!%n", days);

        System.out.println(foodsOutput);
    }
}
