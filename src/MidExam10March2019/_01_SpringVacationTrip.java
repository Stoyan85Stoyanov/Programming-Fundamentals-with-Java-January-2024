package MidExam10March2019;

import java.util.Scanner;

public class _01_SpringVacationTrip {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());
        int people = Integer.parseInt(scanner.nextLine());
        double fuelPerKilometer = Double.parseDouble(scanner.nextLine());
        double foodPricePerPersonDay = Double.parseDouble(scanner.nextLine());
        double priceForRoomPerPerson = Double.parseDouble(scanner.nextLine());

        double hotelForGroup = priceForRoomPerPerson * people * days;

        if (people > 10) {
            hotelForGroup *= 0.75;
        }
        double expenses = (hotelForGroup) + (foodPricePerPersonDay * people * days);
        for (int i = 1; i <= days; i++) {
            expenses += Integer.parseInt(scanner.nextLine()) * fuelPerKilometer;
            if (i % 3 == 0 || i % 5 == 0) {
                expenses *= 1.4;
            }
            if (i % 7 == 0) {
                expenses -= expenses / people;
            }
            if (expenses > budget) {
                System.out.printf("Not enough money to continue the trip. You need %.2f$ more.", expenses - budget);
                return;
            }
        }
        System.out.printf("You have reached the destination. You have %.2f$ budget left.", budget - expenses);
    }
}
