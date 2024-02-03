package MethodsExercise04;

import java.util.Scanner;

public class _07_NxNMatrix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nNumber = Integer.parseInt(scanner.nextLine());

        printTable (nNumber);

    }
    public static void printTable(int nNumber) {

        for (int row = 1; row <= nNumber; row++) {

            for (int col = 1; col <= nNumber ; col++) {

                System.out.print(nNumber + " ");
            }
            System.out.println();
        }
    }
}
