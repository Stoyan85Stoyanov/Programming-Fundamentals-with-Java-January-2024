package ProgrammingFundamentalsFinalExam04;

import java.util.Scanner;

public class _01_PasswordReset {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();
        String input = scanner.nextLine();

        while (!input.equals("Done")) {
            String[] split = input.split("\\s+");

            String commandName = split[0];

            switch (commandName) {
                case "TakeOdd":
                    password = takeOdd(password);
                    System.out.printf("%s%n",password);
                    break;

                case "Cut":
                    int index = Integer.parseInt(split[1]);
                    int length = Integer.parseInt(split[2]);
                    String substringRemove = password.substring(index, index + length);
                    password = password.replaceFirst(substringRemove, "");
                    System.out.printf("%s%n",password);
                    break;

                case "Substitute":
                    String substring = split[1];
                    String substitute = split[2];

                    if (password.contains(substring)) {
                        password = password.replaceAll(substring, substitute);
                        System.out.printf("%s%n",password);
                    } else {
                        System.out.println("Nothing to replace!");
                    }

                    break;

            }

            input = scanner.nextLine();
        }

        System.out.printf("Your password is: %s", password);
    }

    private static String takeOdd(String password) {

        StringBuilder newPassword = new StringBuilder();

        for (int index = 1; index <= password.length() - 1; index += 2) {
            char currentSymbol = password.charAt(index);
            newPassword.append(currentSymbol);
        }
        return newPassword.toString();
    }
}
