package FinalExamPreparation22March2024;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class _02_FancyBarcodes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        String regex = "@#+[A-Z][A-Za-z0-9]{4,}[A-Z]@#+";
        Pattern pattern = Pattern.compile(regex);

        for (int i = 0; i < number; i++) {

            String barcode = scanner.nextLine();
            Matcher matcher = pattern.matcher(barcode);

            if (matcher.find()) {

                StringBuilder productGroup = new StringBuilder();
                for (char symbol : barcode.toCharArray()) {
                    if (Character.isDigit(symbol)) {
                        productGroup.append(symbol);
                    }
                }
                if (productGroup.length() == 0) {
                    System.out.println("Product group: 00");

                } else {
                    System.out.printf("Product group: %s%n", productGroup);
                }
            } else {
                System.out.println("Invalid barcode");
            }
        }
    }
}
