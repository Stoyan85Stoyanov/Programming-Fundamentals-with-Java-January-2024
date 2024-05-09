package FundamentalsMidExamRetake_10December2019;

import java.util.Scanner;

public class _01_DisneylandJourney {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double journeyMoney = Double.parseDouble(scanner.nextLine());
        int numberOfMonths = Integer.parseInt(scanner.nextLine());
        double savedMoney = 0;
        int months = 1;

        while (months <= numberOfMonths) {

            if (months % 4 == 0) {
                savedMoney += savedMoney * 0.25;
            }

            if (months % 2 == 1) {
                savedMoney -= savedMoney * 0.16;
            }

            savedMoney += journeyMoney * 0.25;
            months++;

        }


        double money;
        if (savedMoney >= journeyMoney) {

            money = (savedMoney - journeyMoney);

            System.out.printf("Bravo! You can go to Disneyland and you will have %.2f lv. for souvenirs.", money);

        } else {

            money = (journeyMoney - savedMoney);

            System.out.printf("Sorry. You need %.2f lv. more.", money);

        }
        System.out.println();

    }
}
