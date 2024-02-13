package MidExam16April2019;

import java.util.Scanner;

public class _01_EasterCozonacs {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        double priceFlour = Double.parseDouble(scanner.nextLine());

        double priceEggs = priceFlour * 0.75;
        double priceMilk = priceFlour + (priceFlour * 0.25);
        double priceForOne = priceEggs + priceFlour + priceMilk /4 ;
        int cozonacs = 0;
        int colorEggs = 0;

        while (budget >= priceForOne) {
            cozonacs++;
            colorEggs += 3;

            if (cozonacs % 3 == 0) {
                colorEggs -= cozonacs - 2;
            }
            budget -= priceForOne;
        }
        System.out.printf("You made %d cozonacs! Now you have %d eggs and %.2fBGN left.", cozonacs, colorEggs, budget);
    }
}


