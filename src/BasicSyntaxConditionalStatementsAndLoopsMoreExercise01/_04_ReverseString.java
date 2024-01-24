package BasicSyntaxConditionalStatementsAndLoopsMoreExercise01;

import java.util.Scanner;

public class _04_ReverseString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String Str = scanner.nextLine();

        StringBuilder reversed = new StringBuilder();

        for (int i = Str.length() - 1; i >= 0; i--) {
            reversed.append(Str.charAt(i));
        }

        System.out.println(reversed);
    }
}


