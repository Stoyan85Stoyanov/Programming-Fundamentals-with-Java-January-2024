package ProgrammingFundamentalsFinalExamPreparation;

import java.util.Scanner;

public class _01_PasswordReset_01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();
        String command = scanner.nextLine();

        while (!command.equals("Done")){

            if (command.equals("TakeOdd")){

                String newPassword;

                newPassword = symbolsOnOddPositions(password);
                password = newPassword;
                System.out.println(password);

            } else if (command.contains("Cut")) {
                int index = Integer.parseInt(command.split("\\s+")[1]);
                int length = Integer.parseInt(command.split("\\s+")[2]);

                String textRemove = password.substring(index, index + length);
                password = password.replaceFirst(textRemove, "");
                System.out.println(password);

            } else if (command.contains("Substitute")) {
                String textSubstring = command.split("\\s+")[1];
                String substringText = command.split("\\s+")[2];

                if(password.contains(textSubstring)){

                 password = password.replace(textSubstring, substringText);
                 System.out.println(password);

                }else {
                    System.out.println("Nothing to replace!");
                }
            }
            command = scanner.nextLine();
        }
        System.out.printf("Your password is: %s%n", password);
    }

    private static String symbolsOnOddPositions(String password) {

        StringBuilder newPassword = new StringBuilder();
        for (int position = 0; position <= password.length() - 1; position++) {
            if (position % 2 != 0){
                char currentSymbol = password.charAt(position);
                newPassword.append(currentSymbol);
            }
        }
        return newPassword.toString();
    }
}
