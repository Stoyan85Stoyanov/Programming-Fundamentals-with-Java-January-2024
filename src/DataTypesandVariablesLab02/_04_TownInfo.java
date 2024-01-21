package DataTypesandVariablesLab02;

import java.util.Scanner;

public class _04_TownInfo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String town = scanner.nextLine();
        long population = Long.parseLong(scanner.nextLine());
        short area = Short.parseShort(scanner.nextLine());

        System.out.printf("Town %s has population of %d and area %d square km.", town, population, area);
    }
}
