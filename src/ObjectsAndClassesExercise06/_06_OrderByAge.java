package ObjectsAndClassesExercise06;

import java.util.ArrayList;
import java.util.Scanner;

public class _06_OrderByAge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Person> people = new ArrayList<>();

        String inputLine = scanner.nextLine();

        while (!inputLine.equals("End")) {

            String[] input = inputLine.split("\\s+");

            Person person = new Person(input[0], input[1], Integer.parseInt(input[2]));
            people.add(person);

            inputLine = scanner.nextLine();
        }
        people.stream()
                .sorted((p1, p2) -> Integer.compare(p1.getAge(), p2.getAge()))
                .forEach(person -> System.out.println(person.toString()));
    }

    static class Person {
        String name;
        String id;
        int age;

        public Person(String name, String id, int age) {
            this.name = name;
            this.id = id;
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        public String toString() {
            return String.format("%s with ID: %s is %d years old.", name, id, age);

        }
    }
}
