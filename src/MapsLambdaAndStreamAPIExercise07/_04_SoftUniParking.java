package MapsLambdaAndStreamAPIExercise07;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _04_SoftUniParking {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfCommands = Integer.parseInt(scanner.nextLine());

        Map<String, String> registeredStudents = new LinkedHashMap<>();

        for (int i = 1; i <= numberOfCommands; i++) {

            String[] data = scanner.nextLine().split("\\s+");
            String command = data[0];

            switch (command) {
                case "register":
                    String studentName = data[1];
                    String plateNumber = data[2];

                    if (registeredStudents.containsKey(studentName)) {
                        System.out.printf("ERROR: already registered with plate number %s%n", plateNumber);

                    } else {
                        registeredStudents.put(studentName, plateNumber);
                        System.out.printf("%s registered %s successfully%n", studentName, plateNumber);
                    }
                    break;

                case "unregister":
                    String userName = data[1];

                    if (!registeredStudents.containsKey(userName)) {
                        System.out.println(String.format("ERROR: user %s not found", userName));

                    } else {
                        registeredStudents.remove(userName);
                        System.out.println(String.format("%s unregistered successfully", userName));
                    }
                    break;
            }
        }

        registeredStudents.entrySet().forEach(entry -> System.out.printf("%s => %s%n", entry.getKey(), entry.getValue()));
    }
}
