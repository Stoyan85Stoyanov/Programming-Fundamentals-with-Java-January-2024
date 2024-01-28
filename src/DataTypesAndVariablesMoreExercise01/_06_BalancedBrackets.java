package DataTypesAndVariablesMoreExercise01;

import java.util.Scanner;

public class _06_BalancedBrackets {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int openClamp = 0;
        int closedClamp = 0;

        boolean beenOpened = false;
        boolean balanced = true;

        for (int i = 0; i < num; i++) {

            String input = scanner.nextLine();

            if (beenOpened && input.equals("(")) {
                System.out.println("UNBALANCED");
                balanced = false;
                break;

            } else {
                beenOpened = false;

            }
            if (input.equals("(")) {
                openClamp ++;
                beenOpened = true;

            } else if (input.equals(")"))  {
                closedClamp++;
            }
            if (input.equals("(") && i == num - 1) {
                System.out.println("UNBALANCED");
                balanced = false;
                break;
            }

        }
        if (balanced) {

            if (openClamp == closedClamp) {
                System.out.println("BALANCED");

            } else {
                System.out.println("UNBALANCED");

            }
        }
    }
}
