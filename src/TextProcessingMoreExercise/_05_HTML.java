package TextProcessingMoreExercise;

import java.util.Scanner;

public class _05_HTML {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String first = scanner.nextLine();
        String second = scanner.nextLine();
        String input;

        System.out.printf("<h1>%n    %s%n</h1>%n<article>%n    %s%n</article>%n", first, second);

        while (!"end of comments".equals(input = scanner.nextLine())) {
            System.out.printf("<div>%n    %s%n</div>%n", input);
        }
    }
}
