package MidExam10March2019;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class _02_HelloFrance {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> itemsList = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());

        double budget = Double.parseDouble(scanner.nextLine());

        List<Double> outputList = new ArrayList<>();

        double oldPrice = 0;

        for (String s : itemsList) {

            String[] input = s.split("->");

            double price = Double.parseDouble(input[1]);

            if ((price <= 50.00 && budget >= price) && input[0].equals("Clothes")) {
                oldPrice += price;
                budget -= price;
                outputList.add(price * 1.4);

            } else if ((price <= 35.00 && budget >= price) && input[0].equals("Shoes")) {
                oldPrice += price;
                budget -= price;
                outputList.add(price * 1.4);

            } else if ((price <= 20.50 && budget >= price) && input[0].equals("Accessories")) {
                oldPrice += price;
                budget -= price;
                outputList.add(price * 1.4);
            }
        }
        double salePrice = outputList.stream().mapToDouble(aDouble -> aDouble).sum();

        IntStream.range(0, outputList.size()).forEach(i -> System.out.printf("%.2f ", outputList.get(i)));

        System.out.printf("%nProfit: %.2f%n", salePrice - oldPrice);

        if (salePrice + budget >= 150) {
            System.out.println("Hello, France!");

        } else {
            System.out.println("Time to go.");
        }
    }
}
