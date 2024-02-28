package MapsLambdaAndStreamAPILab07;

import java.util.*;

public class _02_WordSynonyms {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

          int wordsCount = Integer.parseInt(scanner.nextLine());

          LinkedHashMap<String, List<String>> wordSynonymsMap = new LinkedHashMap<>();

        for (int count = 1; count <=wordsCount ; count++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();

            wordSynonymsMap.putIfAbsent(word, new ArrayList<>());
            wordSynonymsMap.get(word).add(synonym);

            }
            for (Map.Entry<String, List<String>> pair : wordSynonymsMap.entrySet()) {
                String word = pair.getKey();
                List<String> synonym = pair.getValue();
                System.out.println(word + " - " + String.join(", ", synonym));
        }
    }
}
