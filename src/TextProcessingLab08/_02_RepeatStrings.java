package TextProcessingLab08;

import java.util.Scanner;

public class _02_RepeatStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         String [] texts = scanner.nextLine().split(" ");

        for ( String text: texts) {
            int length = text.length();

            for (int count = 1; count <= length ; count++) {
                System.out.print(text);
            }
        }
    }
}
