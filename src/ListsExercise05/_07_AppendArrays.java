package ListsExercise05;

import java.util.*;
import java.util.stream.Collectors;

public class _07_AppendArrays {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> elements = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());
        Collections.reverse(elements);

        String output = elements.toString()
                .replace("[", "")
                .replace("]", "")
                .replace(",", "")
                .replaceAll("\\s+", " ")
                .trim();


        System.out.println(output);
    }
}
