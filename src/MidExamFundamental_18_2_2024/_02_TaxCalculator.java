package MidExamFundamental_18_2_2024;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _02_TaxCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> representingVehicles = Arrays.stream(scanner.nextLine().split(">>")).collect(Collectors.toList());


        double sumTaxs = 0;

        for (int i = 0; i < representingVehicles.size(); i++) {
            String[] types = representingVehicles.get(i).split(" ");
            String type = types[0];
            int yearsTax = Integer.parseInt(types[1]);
            int kilometers = Integer.parseInt(types[2]);


            if (type.equals("family")) {
                int initialTax1 = 50;
                double taxes1 = (kilometers / 3000) * 12 + (initialTax1 - yearsTax * 5);
                System.out.printf("A %s car will pay %.2f euros in taxes.%n", type, taxes1);

                sumTaxs += taxes1;


            } else if (type.equals("heavyDuty")) {
                int initialTax2 = 80;
                double taxes2 = (kilometers / 9000) * 14 + (initialTax2 - yearsTax * 8);
                System.out.printf("A %s car will pay %.2f euros in taxes.%n", type, taxes2);

                sumTaxs += taxes2;


            } else if (type.equals("sports")) {
                int initialTax3 = 100;
                double taxes3 = (kilometers / 2000) * 18 + (initialTax3 - yearsTax * 9);
                System.out.printf("A %s car will pay %.2f euros in taxes.%n", type, taxes3);

                sumTaxs += taxes3;


            } else {
                System.out.println("Invalid car type.");
            }

        }
        System.out.printf("The National Revenue Agency will collect %.2f euros in taxes.",sumTaxs);
    }
}
