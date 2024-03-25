package ProgrammingFundamentalsFinalExam05;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _03_Pirates {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> cityPopulation = new LinkedHashMap<>();
        Map<String, Integer> cityGold = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("Sail")) {

            String city = input.split("\\|\\|")[0];
            int population = Integer.parseInt(input.split("\\|\\|")[1]);
            int gold = Integer.parseInt(input.split("\\|\\|")[2]);

            if (!cityPopulation.containsKey(city) && !cityGold.containsKey(city)) {
                cityPopulation.put(city, population);
                cityGold.put(city, gold);

            } else {
                cityPopulation.put(city, cityPopulation.get(city) + population);
                cityGold.put(city, cityGold.get(city) + gold);
            }
            input = scanner.nextLine();
        }

        String command = scanner.nextLine();
        while (!command.equals("End")) {

            String[] commandParts = command.split("=>");
            String commandName = commandParts[0];
            String cities = commandParts[1];

            switch (commandName) {
                case "Plunder":
                    int killedPeople = Integer.parseInt(commandParts[2]);
                    int stealGold = Integer.parseInt(commandParts[3]);
                    System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n", cities, stealGold, killedPeople);

                    cityPopulation.put(cities, cityPopulation.get(cities) - killedPeople);
                    cityGold.put(cities, cityGold.get(cities) - stealGold);

                    if (cityPopulation.get(cities) <= 0 || cityGold.get(cities) <= 0) {
                        cityPopulation.remove(cities);
                        cityGold.remove(cities);
                        System.out.printf("%s has been wiped off the map!%n", cities);
                    }
                    break;

                case "Prosper":
                    int earnedGold = Integer.parseInt(commandParts[2]);
                    if (earnedGold <= 0) {
                        System.out.println("Gold added cannot be a negative number!");

                    } else {
                        cityGold.put(cities, cityGold.get(cities) + earnedGold);
                        System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n", earnedGold, cities, cityGold.get(cities));
                    }
                    break;
            }
            command = scanner.nextLine();
        }

        if (cityPopulation.size() > 0) {
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n", cityGold.size());

            cityGold.entrySet().forEach(entry -> {
                String cities = entry.getKey();
                int gold = entry.getValue();
                int population = cityPopulation.get(cities);
                System.out.printf("%s -> Population: %d citizens, Gold: %d kg%n", cities, population, gold);
            });

        } else {
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");

        }
    }
}
