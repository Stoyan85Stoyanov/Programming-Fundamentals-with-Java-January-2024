package ListsExercise05;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _01_Train {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagons = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int maxCapacity = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        while (!command.equals("end")) {

            if (command.contains("Add")){
               int count = Integer.parseInt(command.split(" ")[1]);
               wagons.add(count);

            }else{
                int passengersToBeAdded = Integer.parseInt(command);

                for (int position = 0; position <=wagons.size() - 1; position++) {
                   int wagon = wagons.get(position);

                   if (wagon + passengersToBeAdded <= maxCapacity){
                     wagons.set(position, wagon + passengersToBeAdded);
                     break;
                   }
                }
            }

            command = scanner.nextLine();
        }
        for (Integer wagon : wagons) {
            System.out.print(wagon + " ");

        }
    }
}
