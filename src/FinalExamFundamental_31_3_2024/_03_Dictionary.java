package FinalExamFundamental_31_3_2024;

import java.util.*;

public class _03_Dictionary {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> wordsMap = new LinkedHashMap<>();


        String input = scanner.nextLine();
        String[] inputs = input.split(" \\| ");

        for (int i = 0; i < inputs.length; i++) {
            String[] wordsInput = inputs[i].split(": ");
            String word = wordsInput[0];
            String definition = wordsInput[1];

            if (!wordsMap.containsKey(word)) {
                List<String> definitionInfo = new ArrayList<>();
                definitionInfo.add(definition);
                wordsMap.put(word, definitionInfo);
            } else {
                List<String> newDefiniton = wordsMap.get(word);
                newDefiniton.add(definition);
                wordsMap.put(word, newDefiniton);
            }
        }

        String input2 = scanner.nextLine();
        String[] inputs2 = input2.split(" \\| ");

        String input3 = scanner.nextLine();

        if (input3.equals("Test")) {
            for (String s : inputs2) {
                if (wordsMap.containsKey(s)) {
                    List<String> output = wordsMap.get(s);
                    String ouputInfo = String.join("\n -", output);
                    System.out.printf("%s:%n -%s%n",s,ouputInfo);
                }
            }
        } else if (input3.equals("Hand Over")) {
            for (Map.Entry<String, List<String>> pair : wordsMap.entrySet()) {
                System.out.printf("%s ", pair.getKey());
            }
        }
    }
}
