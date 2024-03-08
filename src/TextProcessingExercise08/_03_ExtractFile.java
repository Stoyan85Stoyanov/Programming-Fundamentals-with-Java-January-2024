package TextProcessingExercise08;

import java.util.Scanner;

public class _03_ExtractFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String path = scanner.nextLine();

        String [] elements = path.split("\\\\");

        String fileName = elements[elements.length - 1].split("\\.")[0];
        String fileExtension = elements[elements.length - 1].split("\\.")[1];

        System.out.println("File name: " + fileName);
        System.out.println("File extension: " + fileExtension);
    }
}
