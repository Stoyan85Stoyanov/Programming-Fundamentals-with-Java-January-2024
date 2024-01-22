package ProgrammingFundamentalsMidExam04;

import java.util.Scanner;

public class _01_GuineaPig {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double foodKG = Double.parseDouble(scanner.nextLine());
        double hayKG = Double.parseDouble(scanner.nextLine());
        double coverKG = Double.parseDouble(scanner.nextLine());
        double weightKG = Double.parseDouble(scanner.nextLine());

        double foodGram = foodKG * 1000;
        double hayGram = hayKG * 1000;
        double coverGram = coverKG * 1000;
        double weightGram = weightKG * 1000;


        for (int day = 1; day <= 30; day++) {
            foodGram = foodGram - 300;

            if (day % 2 == 0) {
                hayGram = hayGram - (foodGram * 0.05);
            }

            if (day % 3 == 0) {
                coverGram = coverGram - (weightGram * 1 / 3);
            }

            if (foodGram <= 0 || hayGram <= 0 || coverGram <= 0) {
                System.out.println("Merry must go to the pet store!");
                return;
            }
        }
            if (foodGram > 0 || hayGram > 0 || coverGram > 0) {

                System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.", foodGram/1000, hayGram/1000, coverGram/1000);
            }
    }
}