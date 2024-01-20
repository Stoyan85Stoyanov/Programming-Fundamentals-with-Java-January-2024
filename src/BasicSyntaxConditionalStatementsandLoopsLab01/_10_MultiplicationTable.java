package BasicSyntaxConditionalStatementsandLoopsLab01;

import java.util.Scanner;

public class _10_MultiplicationTable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int multiplier = 1; multiplier <= 10; multiplier++) {
            System.out.printf("%d X %d = %d%n", number, multiplier, number * multiplier);
        }
    }
}





