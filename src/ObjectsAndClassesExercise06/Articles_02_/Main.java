package ObjectsAndClassesExercise06.Articles_02_;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");

        String title = input[0];
        String content = input[1];
        String author = input[2];

        Article article = new Article(title, content, author);

        int countCommands = Integer.parseInt(scanner.nextLine());
        for (int count = 1; count <= countCommands; count++) {
            String[] command = scanner.nextLine().split(": ");

            String commandName = command[0];
            String commandParam = command[1];

            switch (commandName) {
                case "Edit":
                    article.edit(commandParam);
                    break;

                case "ChangeAuthor":
                    article.changeAuthor(commandParam);
                    break;

                case "Rename":
                    article.rename(commandParam);
                    break;

            }
        }
        System.out.println(article.toString());
    }
}
