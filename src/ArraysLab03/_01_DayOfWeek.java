package ArraysLab03;

import java.util.Scanner;

public class _01_DayOfWeek {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberDay = Integer.parseInt(scanner.nextLine());

        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday",
                "Friday", "Saturday", "Sunday"};

        if (numberDay >= 1 && numberDay <= 7) {

            System.out.println(daysOfWeek[numberDay - 1]);
        } else {
            System.out.println("Invalid day!");
        }
    }
}
