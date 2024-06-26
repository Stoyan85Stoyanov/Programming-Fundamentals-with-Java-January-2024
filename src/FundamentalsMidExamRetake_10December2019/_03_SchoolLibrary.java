package FundamentalsMidExamRetake_10December2019;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class _03_SchoolLibrary {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> bookList = Arrays.stream((scanner.nextLine().split("&+"))).collect(Collectors.toList());
        IntStream.range(0, bookList.size()).forEach(i -> bookList.set(i, bookList.get(i).trim()));

        String input;

        while (!"Done".equals(input = scanner.nextLine())) {

            String[] command = input.split("\\|");

            switch (command[0].trim()) {

                case "Add Book":
                    if (!bookList.contains(command[1].trim())) {
                        bookList.add(0, command[1].trim());
                    }
                    break;

                case "Take Book":
                    bookList.remove(command[1].trim());
                    break;

                case "Swap Books":
                    if (bookList.contains(command[1].trim()) && bookList.contains(command[2].trim())) {
                        Collections.swap(bookList, bookList.indexOf(command[1].trim()), bookList.indexOf(command[2].trim()));
                    }
                    break;

                case "Insert Book":
                    bookList.add(command[1].trim());
                    break;

                case "Check Book":
                    if (Integer.parseInt(command[1].trim()) >= 0 && Integer.parseInt(command[1].trim()) < bookList.size()) {
                        System.out.println(bookList.get(Integer.parseInt(command[1].trim())));
                    }
                    break;
            }
        }
        System.out.println(bookList.toString().replaceAll("[\\[\\]]", ""));

    }
}
