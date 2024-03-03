package MapsLambdaAndStreamAPIExercise07;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _03_Orders {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> productsQuantity = new LinkedHashMap<>();
        Map<String, Double> productsPrice = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("buy")) {

              String productsName = input.split(" ")[0];
              double price = Double.parseDouble(input.split(" ")[1]);
              int quantity = Integer.parseInt(input.split(" ")[2]);

              if (productsQuantity.containsKey(productsName)) {
                  int existingQuantity = productsQuantity.get(productsName);
                  productsQuantity.put(productsName, existingQuantity + quantity);
              }else {
                  productsQuantity.put(productsName, quantity);
              }

              productsPrice.put(productsName, price);

            input = scanner.nextLine();
        }
        for (Map.Entry<String, Integer> entry : productsQuantity.entrySet()) {

            String productName = entry.getKey();
            int productQuantity = entry.getValue();
            double productPrice = productsPrice.get(productName);

            System.out.printf("%s -> %.2f%n", productName, productQuantity * productPrice);
        }
    }
}
