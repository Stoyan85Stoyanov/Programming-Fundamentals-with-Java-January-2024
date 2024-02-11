package ListsMoreExercise01;

import java.util.*;
import java.util.stream.Collectors;

public class _04_MixedUpLists {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstNumbersList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> secondNumbersList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> finalNumbersList = new ArrayList<>();

        while (!(firstNumbersList.isEmpty() || secondNumbersList.isEmpty())) {

            finalNumbersList.add(firstNumbersList.get(0));
            finalNumbersList.add(secondNumbersList.get(secondNumbersList.size() - 1));
            firstNumbersList.remove(0);
            secondNumbersList.remove(secondNumbersList.size() - 1);
        }
        int minValue;
        int maxValue;

        if (!firstNumbersList.isEmpty()) {

            minValue = Math.min(firstNumbersList.get(firstNumbersList.size() - 1), firstNumbersList.get(firstNumbersList.size() - 2));
            maxValue = Math.max(firstNumbersList.get(firstNumbersList.size() - 1), firstNumbersList.get(firstNumbersList.size() - 2));

        } else {

            minValue = Math.min(secondNumbersList.get(0), secondNumbersList.get(1));
            maxValue = Math.max(secondNumbersList.get(0), secondNumbersList.get(1));
        }
        for (int i = 0; i < finalNumbersList.size(); i++) {

            if (finalNumbersList.get(i) >= maxValue || finalNumbersList.get(i) <= minValue) {
                finalNumbersList.remove(i);
                i--;
            }
        }
        Collections.sort(finalNumbersList);

        System.out.println(finalNumbersList.toString().replaceAll("[\\[\\],]", "")
                .replaceAll(", ", " "));

    }
}
