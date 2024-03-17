package ProgrammingFundamentalsFinalExamPreparation;

import java.util.Scanner;

public class _01_PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();
        String command = scanner.nextLine();

        while (!command.equals("Done")) {
            String[] tokens = command.split("\\s+");

            String commandName = tokens[0];
            switch (commandName) {
                case "TakeOdd":

                    password = takeOdd(password);
                    System.out.println(password);
                    break;

                case "Cut":
                     int index = Integer.parseInt(tokens [1]);
                     int length = Integer.parseInt(tokens [2]);
                     String substringForRemove = password.substring(index, index + length);
                     password = password.replaceFirst(substringForRemove, "");
                     System.out.println(password);
                    break;

                case "Substitute":
                    String substring = tokens [1];
                    String substitute = tokens [2];

                    if (password.contains(substring)) {
                        password = password.replace(substring, substitute);
                        System.out.println(password);

                    }else {
                        System.out.println("Nothing to replace!");
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.println("Your password is: " + password);
    }

    private static String takeOdd(String password) {

        StringBuilder newPassword = new StringBuilder();
        for (int index = 1; index <= password.length() - 1; index += 2) {
              char currentSymbol =  password.charAt(index);
              newPassword.append(currentSymbol);
        }
        return newPassword.toString();
    }
}
