package RegularExpressionsMoreExercise01;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _04_Santa_sSecretHelper {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int keys = Integer.parseInt(scanner.nextLine());

        String nameBehavior = "@(?<name>[A-Za-z]+)[^@!:>-]*!(?<behavior>[GN])!";
        Pattern pattern = Pattern.compile(nameBehavior);
        Matcher matcher;

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            StringBuilder decodedMessage = new StringBuilder();

            for (int i = 0; i < input.length(); i++) {
                int symbolCode = input.charAt(i);
                symbolCode -= keys;
                char newSymbol = (char) symbolCode;
                decodedMessage.append(newSymbol);
            }

            matcher = pattern.matcher(decodedMessage);

            while (matcher.find()) {
                String name = matcher.group("name");
                String behavior = matcher.group("behavior");

                if (behavior.equals("G")) {
                    System.out.println(name);
                }
            }
            input = scanner.nextLine();
        }
    }
}
