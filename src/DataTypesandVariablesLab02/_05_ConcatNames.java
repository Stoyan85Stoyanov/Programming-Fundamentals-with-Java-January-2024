package DataTypesandVariablesLab02;

import java.util.Scanner;

public class _05_ConcatNames {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine();
        String secondName = scanner.nextLine();
        String delimiter = scanner.nextLine();

//        System.out.printf("%s%s%s", firstName, delimiter, secondName);
//        System.out.println();
        System.out.print(firstName.concat(delimiter).concat(secondName));
        System.out.println();
        System.out.println(firstName + delimiter + secondName);
    }
}
