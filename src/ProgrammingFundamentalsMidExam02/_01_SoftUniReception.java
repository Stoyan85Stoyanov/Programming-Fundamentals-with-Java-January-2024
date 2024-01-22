package ProgrammingFundamentalsMidExam02;

import java.util.Scanner;

public class _01_SoftUniReception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());
        int studentsCount = Integer.parseInt(scanner.nextLine());

        int hour = 0;

        while (studentsCount > 0) {
            studentsCount -= first;
            studentsCount -= second;
            studentsCount -= third;
            hour++;

            if (hour % 4 == 0) {
                hour++;
            }

        }

        System.out.printf("Time needed: %dh.", hour);
    }
}
