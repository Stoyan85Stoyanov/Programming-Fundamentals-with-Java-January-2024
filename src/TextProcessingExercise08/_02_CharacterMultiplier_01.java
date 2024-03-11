package TextProcessingExercise08;

import java.util.Scanner;

public class _02_CharacterMultiplier_01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String arguments = scanner.nextLine();

        String firstText = arguments.split("\\s+")[0];
        String secondText = arguments.split("\\s+")[1];

        int minLength = Math.min(firstText.length(), secondText.length());
        int maxLength = Math.max(firstText.length(), secondText.length());


        int sumCodes = 0;
        for (int index = 0; index < minLength; index++) {
            sumCodes += (firstText.charAt(index) * secondText.charAt(index));
        }

        if (maxLength == minLength) {
            System.out.printf("%d%n",sumCodes);
            return;

        } else {
            sumCodes += getRemainingSymbolSum(firstText, secondText, minLength, maxLength);
        }

        System.out.printf("%d%n",sumCodes);
    }

    private static int getRemainingSymbolSum(String firstText, String secondText, int minLength, int maxLength) {

        int remainingSum = 0;

        if (maxLength == firstText.length()) {
            for (int index = minLength; index < firstText.length(); index++) {
                remainingSum += firstText.charAt(index);
            }
        } else {
            for (int index = minLength; index < secondText.length(); index++) {
                remainingSum += secondText.charAt(index);
            }
        }
        return remainingSum;
    }
}
