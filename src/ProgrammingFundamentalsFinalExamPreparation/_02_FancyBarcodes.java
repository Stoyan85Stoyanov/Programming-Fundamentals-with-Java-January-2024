package ProgrammingFundamentalsFinalExamPreparation;

import javax.swing.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _02_FancyBarcodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        String productRegex = "@#+(?<product>[A-Z][a-zA-Z0-9]{4,}[A-Z])@#+";
        Pattern pattern = Pattern.compile(productRegex);

        for (int i = 0; i < number; i++) {
            String barcode = scanner.nextLine();
            Matcher matcher = pattern.matcher(barcode);

             if (matcher.find()) {
                 String product = matcher.group("product");
                 String productGroup = "";

                 for (int index = 0; index <= product.length() - 1 ; index++) {
                     char currentSymbol = product.charAt(index);
                     if (Character.isDigit(currentSymbol)){
                          productGroup += currentSymbol;
                     }
                 }
                 if (productGroup.equals("")) {
                     System.out.println("Product group: 00");
                 }else {
                     System.out.println("Product group: " + productGroup);
                 }
             }else {
                 System.out.println("Invalid barcode");
             }
        }
    }
}
