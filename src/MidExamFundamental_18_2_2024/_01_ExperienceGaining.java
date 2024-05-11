package MidExamFundamental_18_2_2024;

import java.util.Scanner;

public class _01_ExperienceGaining {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double neededExperienceAmount = Double.parseDouble(scanner.nextLine());
        int countOfBattles = Integer.parseInt(scanner.nextLine());


        double sum = 0;

        int count = 0;
        for (int days = 1; days <= countOfBattles; days++) {
            count++;
            double experience = Double.parseDouble(scanner.nextLine());
            if (days % 3 == 0) {

                sum += experience + (experience * 0.15);


            } else if (days % 5 == 0) {

                sum += experience - (experience * 0.10);

            } else {
                sum += experience;

            }
            if (sum >= neededExperienceAmount) {
                break;
            }


        }
        if (sum >= neededExperienceAmount) {
            System.out.printf("Player successfully collected his needed experience for %d battles.", count);
        } else {
            System.out.printf("Player was not able to collect the needed experience, %.2f more needed.", neededExperienceAmount - sum);
        }
    }
}
