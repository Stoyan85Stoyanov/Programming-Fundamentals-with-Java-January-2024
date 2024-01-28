package DataTypesAndVariablesMoreExercise01;

import java.util.Scanner;

public class _05_DecryptingMessage {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int key = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {

            char input = scanner.nextLine().charAt(0);

            int shifted = (int) input + key;

            System.out.print((char) shifted);

        }
    }
}
