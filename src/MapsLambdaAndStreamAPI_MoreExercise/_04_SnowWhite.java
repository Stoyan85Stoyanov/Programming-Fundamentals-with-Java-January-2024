package MapsLambdaAndStreamAPI_MoreExercise;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class _04_SnowWhite {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, Integer> dwarfs = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!"Once upon a time".equals(input)) {
            String[] inputArr = input.split(" <:> ");
            String dwarfName = inputArr[0];
            String dwarfHatColor = inputArr[1];
            String nameColor = String.join(" ", dwarfHatColor, dwarfName);
            int dwarfPhysics = Integer.parseInt(inputArr[2]);

            dwarfs.putIfAbsent(nameColor, 0);

            if (dwarfs.get(nameColor) < dwarfPhysics) {
                dwarfs.put(nameColor, dwarfPhysics);
            }

            input = scanner.nextLine();

        }

        dwarfs.entrySet()
                .stream()
                .sorted((d1, d2) -> {
                    Integer d1physic = d1.getValue();
                    Integer d2physic = d2.getValue();
                    int sort = d1physic.compareTo(d2physic);
                    if (sort == 0) {
                        String firstColor = d1.getKey().split(" ")[0];
                        String secondColor = d2.getKey().split(" ")[0];
                        int countFirstColor = (int) dwarfs.entrySet().stream().filter(entry -> entry.getKey().split(" ")[0].equals(firstColor)).count();
                        int countSecondColor = (int) dwarfs.entrySet().stream().filter(entry -> entry.getKey().split(" ")[0].equals(secondColor)).count();
                        return Integer.compare(countSecondColor, countFirstColor);
                    }
                    return Integer.compare(d2physic, d1physic);

                }).forEach(d -> {
                    String color = d.getKey().split(" ")[0];
                    String name = d.getKey().split(" ")[1];
                    Integer physic = d.getValue();

                    System.out.printf("(%s) %s <-> %d%n", color, name, physic);
                });
    }
}
