package TextProcessingExercise08;

import java.util.Scanner;

public class _02_CharacterMultiplier {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] codes = scanner.nextLine().split(" ");

        char[] stringFirst = codes[0].toCharArray();
        char[] stringSecond = codes[1].toCharArray();


        System.out.printf(String.valueOf(totalSum(stringFirst, stringSecond)));
        System.out.println();
    }

    private static int totalSum(char[] first, char[] second) {
        int sum = 0;

        if (first.length > second.length) {
            for (int i = 0; i < first.length; i++) {
                if (i < second.length) {
                    sum += first[i] * second[i];
                } else {
                    sum += first[i];
                }
            }
            return sum;

        } else if (first.length < second.length) {
            for (int i = 0; i < second.length; i++) {
                if (i < first.length) {
                    sum += second[i] * first[i];
                } else {
                    sum += second[i];
                }
            }
            return sum;

        } else {
            for (int i = 0; i < first.length; i++) {
                sum += first[i] * second[i];
            }
            return sum;
        }
    }
}
