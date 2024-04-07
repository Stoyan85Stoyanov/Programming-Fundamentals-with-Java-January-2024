package ExamPreparation20March2024;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _03_BakeryShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> commandMap = new LinkedHashMap<>();

        String commandInput;
        int foofSum = 0;

        while (!"Complete".equals(commandInput = scanner.nextLine())) {

            String[] commandParts = commandInput.split("\\s+");
            String command = commandParts[0];
            int quantity = Integer.parseInt(commandParts[1]);
            String food = commandParts[2];
            int currentQuantity;

            switch (command) {

                case "Receive":
                    if (quantity >= 0) {
                        if (!commandMap.containsKey(food)) {
                            commandMap.put(food, quantity);
                        } else {
                            currentQuantity = commandMap.get(food);
                            commandMap.put(food, currentQuantity + quantity);
                        }
                    }
                    break;

                case "Sell":
                    if (!commandMap.containsKey(food)) {
                        System.out.printf("You do not have any %s.%n", food);

                    } else {
                        currentQuantity = commandMap.get(food);

                        if (quantity > currentQuantity) {

                            foofSum = foofSum + currentQuantity;
                            System.out.printf("There aren't enough %s. You sold the last %d of them.%n", food, currentQuantity);

                            commandMap.remove(food);

                        } else {
                            foofSum = foofSum + quantity;
                            System.out.printf("You sold %d %s.%n", quantity, food);

                            commandMap.put(food, currentQuantity - quantity);

                            if (currentQuantity - quantity <= 0) {
                                commandMap.remove(food);
                            }
                        }
                    }
                    break;
            }
        }
            for (Map.Entry<String, Integer> inStock : commandMap.entrySet()) {
                String stock = inStock.getKey();
                int amountFood = inStock.getValue();
                System.out.println(stock + ": " + amountFood);
            }
            System.out.printf("All sold: %d goods%n", foofSum);

        }
    }

