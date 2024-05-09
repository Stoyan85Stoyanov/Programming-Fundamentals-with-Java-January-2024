package FinalExamFundamental_31_3_2024;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _02_MessageTranslator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String regex = "(!)(?<command>[A-Z]{1}[a-z]{2,})\\1:(\\[)([A-Za-z]{8,})(\\])";
        Pattern pattern = Pattern.compile(regex);

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()){
                System.out.print(matcher.group("command"));
                System.out.print(":");

                String name = matcher.group(4);
                for (int j = 0; j < name.length(); j++) {
                    char character = name.charAt(j);
                    int ascii = (int) character;
                    System.out.print(" "+ ascii);
                }
                System.out.println();

            }else{
                System.out.println("The message is invalid");
            }
        }
    }
}
