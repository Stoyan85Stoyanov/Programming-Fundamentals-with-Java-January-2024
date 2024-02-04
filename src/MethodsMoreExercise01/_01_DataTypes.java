package MethodsMoreExercise01;

import java.util.Scanner;

public class _01_DataTypes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        String input = scanner.nextLine();

        multipleData(input, type);

    }

    private static void multipleData(String input, String type) {

        switch (type) {

            case "int":
                System.out.println(Integer.parseInt(input) * 2);
                break;

            case "real":

                System.out.printf("%.2f", Double.parseDouble(input) * 1.5);
                break;

            case "string":

                System.out.printf("$%s$", input);
        }
    }
}

//package MethodsMoreExercise01;
//
//        import java.util.Scanner;
//
//public class _01_DataTypes {
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        String command = scanner.nextLine();
//        String input = scanner.nextLine();
//
//        switch (command){
//
//            case "int":
//
//                int numberInt = Integer.parseInt(input);
//                multiplyBy2 (numberInt);
//                break;
//
//            case "real":
//
//                double numberDouble = Double.parseDouble(input);
//                realMultiplyAndFormat (numberDouble);
//                break;
//
//            case "string":
//
//                stringFormattedPrint (input);
//                break;
//        }
//    }
//
//    private static void multiplyBy2(int numberInt) {
//
//        numberInt = numberInt * 2;
//        System.out.println(numberInt);
//    }
//
//    private static void realMultiplyAndFormat(double numberDouble) {
//
//        numberDouble = numberDouble *  1.5;
//        System.out.printf("%.2f", numberDouble);
//        System.out.println();
//    }
//
//    private static void stringFormattedPrint(String input) {
//
//        System.out.printf("$%s$",input);
//        System.out.println();
//
//    }
//}
