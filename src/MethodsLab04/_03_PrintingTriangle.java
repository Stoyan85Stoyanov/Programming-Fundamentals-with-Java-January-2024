package MethodsLab04;

import java.util.Scanner;

public class _03_PrintingTriangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sizeTriangle = Integer.parseInt(scanner.nextLine());

        printFigure(sizeTriangle);

    }

    public static void printFigure(int sizeTriangle){
        for (int i = 1; i <= sizeTriangle; i++) {
            printRow(i);
        }

        for (int i = sizeTriangle - 1; i >= 1 ; i--) {
            printRow(i);
        }
    }

    public static void printRow(int elementsCount) {
        for (int start = 1; start <= elementsCount; start++) {
            System.out.printf("%d ", start);
        }
        System.out.println();
    }
}

