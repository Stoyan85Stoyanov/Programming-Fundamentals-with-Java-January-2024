package MapsLambdaAndStreamAPILab07;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _01_CountRealNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double [] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();

        TreeMap <Double, Integer> numbersCountMap = new TreeMap<>();

        for (double number: numbers) {
            if (!numbersCountMap.containsKey(number)) {
                numbersCountMap.put(number, 1);

            }else{
                int currentCount = numbersCountMap.get(number);
                numbersCountMap.put(number, currentCount + 1);
            }
        }
        for (Map.Entry <Double, Integer> pair : numbersCountMap.entrySet()) {
            System.out.printf("%.0f -> %d%n", pair.getKey(), pair.getValue());
        }
    }
}
