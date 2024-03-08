package TextProcessingExercise08;

import java.util.Scanner;

public class _01_ValidUsernames {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] userNames = scanner.nextLine().split(", ");

        for (String userName : userNames) {

            if (isUserNameValid(userName)) {
                System.out.println(userName);
            }

        }
    }

    private static boolean isUserNameValid(String userName) {

        if (userName.length() < 3 || userName.length() > 16) {
            return  false;
        }
        for (char symbol : userName.toCharArray()) {
            if (!Character.isLetterOrDigit(symbol) && symbol != '-' && symbol != '_') {
                return false;
            }
        }
        return true;
    }
}
