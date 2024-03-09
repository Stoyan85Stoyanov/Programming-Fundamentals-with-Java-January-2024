package TextProcessingExercise08;

import java.util.Scanner;

public class _06_ReplaceRepeatingChars {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder inputLetter = new StringBuilder(scanner.nextLine());

        for (int i = 0; i < inputLetter.length() - 1; i++) {

            if (inputLetter.charAt(i) == inputLetter.charAt(i + 1)) {
                inputLetter.deleteCharAt(i + 1);
                i--;
            }
        }
        System.out.printf("%s%n",inputLetter);
    }
}
