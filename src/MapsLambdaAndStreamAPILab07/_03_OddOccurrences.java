package MapsLambdaAndStreamAPILab07;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _03_OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");

        LinkedHashMap<String, Integer> counts = new LinkedHashMap<>();

        for (String word : words) {
            word = word.toLowerCase();

            counts.putIfAbsent(word, 0);
            counts.put(word, counts.get(word) + 1);
        }

        ArrayList<String> oddNumber = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : counts.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                oddNumber.add(entry.getKey());
            }
        }

        System.out.println(String.join(", ", oddNumber));
    }
}

