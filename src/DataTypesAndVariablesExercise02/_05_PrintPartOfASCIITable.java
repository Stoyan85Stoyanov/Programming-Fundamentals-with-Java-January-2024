package DataTypesAndVariablesExercise02;

import java.util.Scanner;

public class _05_PrintPartOfASCIITable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());

        for (int asciiValue = start; asciiValue <=end; asciiValue++) {

            System.out.print((char) asciiValue + " ");

        }
    }
}




