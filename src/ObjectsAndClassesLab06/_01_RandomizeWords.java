package ObjectsAndClassesLab06;


import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _01_RandomizeWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> wordsArray = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        Random rdm = new Random();

        while (!wordsArray.isEmpty()) {
            String word = wordsArray.remove(rdm.nextInt(wordsArray.size()));
            System.out.println(word);

        }
    }
}
