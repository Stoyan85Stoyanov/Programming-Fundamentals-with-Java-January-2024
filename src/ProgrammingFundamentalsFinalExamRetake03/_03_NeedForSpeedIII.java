package ProgrammingFundamentalsFinalExamRetake03;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _03_NeedForSpeedIII {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfCars = Integer.parseInt(scanner.nextLine());

        Map<String, Integer[]> carMap = new LinkedHashMap<>();

        for (int i = 1; i <= numberOfCars; i++) {
            String[] split = scanner.nextLine().split("\\|");
            String car = split[0];
            int mileage = Integer.parseInt(split[1]);
            int fuel = Integer.parseInt(split[2]);

            carMap.putIfAbsent(car, new Integer[2]);

            carMap.get(car)[0] = mileage;
            carMap.get(car)[1] = fuel;
        }
        String command = scanner.nextLine();

        while (!command.equals("Stop")) {
            String[] commandParts = command.split(" : ");
            String keyCommand = commandParts[0];
            String keyCar = commandParts[1];

            switch (keyCommand) {

                case "Drive":
                    int distance = Integer.parseInt(commandParts[2]);
                    int fuel = Integer.parseInt(commandParts[3]);

                    if (carMap.get(keyCar)[1] < fuel) {
                        System.out.println("Not enough fuel to make that ride");
                    } else {
                        carMap.get(keyCar)[0] += distance;
                        carMap.get(keyCar)[1] -= fuel;
                        System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n", keyCar, distance, fuel);
                        if (100000 < carMap.get(keyCar)[0]) {
                            carMap.remove(keyCar);
                            System.out.printf("Time to sell the %s!%n", keyCar);
                        }
                    }
                    break;

                case "Refuel":
                    int fuelRefuel = Integer.parseInt(commandParts[2]);

                    if (75 < fuelRefuel + carMap.get(keyCar)[1]) {
                        fuelRefuel = 75 - carMap.get(keyCar)[1];
                        carMap.get(keyCar)[1] = 75;
                    } else {
                        carMap.get(keyCar)[1] += fuelRefuel;
                    }
                    System.out.printf("%s refueled with %d liters%n", keyCar, fuelRefuel);
                    break;

                case "Revert":
                    int kilometers = Integer.parseInt(commandParts[2]);

                    if (10000 < carMap.get(keyCar)[0] - kilometers ) {
                        carMap.get(keyCar)[0] -= kilometers;
                        System.out.printf("%s mileage decreased by %d kilometers%n", keyCar, kilometers);
                    } else {
                        carMap.get(keyCar)[0] = 10000;
                    }
                    break;

            }
            command = scanner.nextLine();
        }
        carMap.entrySet().stream().sorted((a, b) -> Integer.compare(b.getValue()[1], a.getValue()[1]))
                .forEach(entry -> System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n", entry.getKey(), entry.getValue()[0], entry.getValue()[1]));
    }
}
