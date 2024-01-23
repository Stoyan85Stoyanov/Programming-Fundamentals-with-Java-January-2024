package BasicSyntaxConditionalStatementsAndLoopsMoreExercise01;

import java.util.Scanner;

public class _02_EnglishNameOfTheLastDigit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int givenNumber = number % 10;

        if (givenNumber < 0) {
            givenNumber = Math.abs(givenNumber);
        }

        String englishName = "";

        switch (givenNumber) {
            case 0:
                englishName = "zero";
                break;

            case 1:
                englishName = "one";
                break;

            case 2:
                englishName = "two";
                break;

            case 3:
                englishName = "three";
                break;

            case 4:
                englishName = "four";
                break;

            case 5:
                englishName = "five";
                break;

            case 6:
                englishName = "six";
                break;

            case 7:
                englishName = "seven";
                break;

            case 8:
                englishName = "eight";
                break;

            case 9:
                englishName = "nine";
                break;
        }

        System.out.println(englishName);
    }
}
