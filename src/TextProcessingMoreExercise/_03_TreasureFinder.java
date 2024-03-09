package TextProcessingMoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class _03_TreasureFinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] keys = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        String input = scanner.nextLine();

        while (!"find".equals(input)) {
            StringBuilder text = new StringBuilder();
            int keyCounter = 0;

            for (int i = 0; i < input.length(); i++) {
                text.append((char) (input.charAt(i) - keys[keyCounter]));
                keyCounter++;

                if (keyCounter > keys.length - 1) {
                    keyCounter = 0;
                }
            }
            System.out.printf("Found %s at %s%n", text.substring(text.indexOf("&") + 1, text.lastIndexOf("&")),text.substring(text.indexOf("<") + 1, text.indexOf(">")));

            input = scanner.nextLine();
        }
    }
}
