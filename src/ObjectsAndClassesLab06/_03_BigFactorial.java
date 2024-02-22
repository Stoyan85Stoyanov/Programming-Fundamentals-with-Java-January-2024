package ObjectsAndClassesLab06;

import java.math.BigInteger;
import java.util.Scanner;

public class _03_BigFactorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        BigInteger resultFactorial = new BigInteger("1");

        for (int i = 1; i <= number; i++) {
            resultFactorial = resultFactorial.multiply(BigInteger.valueOf(i));
        }

        System.out.println(resultFactorial);
    }
}
