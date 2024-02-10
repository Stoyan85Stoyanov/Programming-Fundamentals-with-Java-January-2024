package ListsMoreExercise01;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class _01_Messaging {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String text = scanner.nextLine();
        List<Character> textList = IntStream.range(0, text.length()).mapToObj(text::charAt).collect(Collectors.toList());

        StringBuilder output = new StringBuilder();

        for (int num : numbersList) {
            int index = 0;
            while (num > 0) {
                index += num % 10;
                num /= 10;
            }
            if (!(index < textList.size() - 1)) {
                index = (index % textList.size());
            }
            output.append(textList.get(index));
            textList.remove(index);
        }
        System.out.println(output);
    }
}
