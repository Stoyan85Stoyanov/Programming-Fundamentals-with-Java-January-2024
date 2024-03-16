package RegularExpressionsMoreExercise01;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

public class _02_RageQuit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile("([^\\d]+)([\\d]{1,2})");
        Matcher matcher = pattern.matcher(input);
        StringBuilder output = new StringBuilder();

        while (matcher.find()) {
            IntStream.range(0, Integer.parseInt(matcher.group(2))).mapToObj(i -> matcher.group(1).toUpperCase()).forEach(output::append);
        }
        System.out.printf("Unique symbols used: %d%n%s%n", output.chars().distinct().count(), output);
    }
}
