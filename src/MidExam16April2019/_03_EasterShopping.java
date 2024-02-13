package MidExam16April2019;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _03_EasterShopping {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> shopList = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        int countOfCommand = Integer.parseInt(scanner.nextLine());

        while (countOfCommand-- > 0) {

            String[] command = scanner.nextLine().split("\\s+");

            switch (command[0]) {

                case "Include":
                    shopList.add(command[1]);
                    break;

                case "Visit":
                    int num = Integer.parseInt(command[2]);
                    if (num <= shopList.size()) {
                        if (command[1].equals("first")) {
                            shopList.subList(0, num).clear();
                        } else {
                            shopList.subList(shopList.size() - num, shopList.size()).clear();
                        }
                    }
                    break;

                case "Prefer":
                    int first = Integer.parseInt(command[1]);
                    int second = Integer.parseInt(command[2]);
                    if ((first >= 0 && first < shopList.size()) && (second >= 0 && second < shopList.size())) {
                        String oldData = shopList.get(first);
                        shopList.set(first, shopList.get(second));
                        shopList.set(second, oldData);
                    }
                    break;

                case "Place":
                    if (Integer.parseInt(command[2]) >= 0 && Integer.parseInt(command[2]) < shopList.size()) {
                        shopList.add(Integer.parseInt(command[2]) + 1, command[1]);
                    }
                    break;
            }
        }
        System.out.println("Shops left:");
        System.out.println(String.join(" ", shopList));
    }
}
