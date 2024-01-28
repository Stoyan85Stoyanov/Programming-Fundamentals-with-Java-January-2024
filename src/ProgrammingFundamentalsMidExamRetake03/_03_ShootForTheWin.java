package ProgrammingFundamentalsMidExamRetake03;

import java.util.Arrays;
import java.util.Scanner;

public class _03_ShootForTheWin {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] number = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        Boolean[] position = new Boolean[number.length];

        Arrays.fill(position, true);
        String input;
        int countShot = 0;

        while (!"End".equals(input = scanner.nextLine())) {

            int shot = Integer.parseInt(input);

            if (shot >= 0 && shot < number.length) {

                if (position[shot]) {

                    int value = number[shot];

                    for (int i = 0; i < number.length; i++) {

                        if (!(i == shot)) {

                            if (number[i] > number[shot] && position[i]) {
                                number[i] -= value;

                            } else if (position[i]) {
                                number[i] += value;
                            }
                        }
                    }
                    number[shot] = -1;
                    countShot++;
                    position[shot] = false;
                }
            }
        }
        System.out.printf("Shot targets: %d -> ", countShot);
        System.out.print(Arrays.toString(number).replaceAll("[\\[\\]]", "").replaceAll(", ", " "));
    }
}
