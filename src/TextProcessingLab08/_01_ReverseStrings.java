package TextProcessingLab08;

import java.util.Scanner;

public class _01_ReverseStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         String input = scanner.nextLine();

         while (!input.equals("end")) {
             StringBuilder reverseWord = new StringBuilder();

             for (int position = input.length() - 1; position >= 0 ; position--) {
                 char currentSymbol = input.charAt(position);
                 reverseWord.append(currentSymbol);

             }
             System.out.println(input + " = " + reverseWord);
             input = scanner.nextLine();
         }
    }
}
