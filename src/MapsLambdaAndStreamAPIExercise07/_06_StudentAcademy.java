package MapsLambdaAndStreamAPIExercise07;

import java.util.*;

public class _06_StudentAcademy {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countStudents = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> studentsGrades = new LinkedHashMap<>();

        for (int i = 0; i < countStudents; i++) {

            String studentName = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if (studentsGrades.containsKey(studentName)) {
                studentsGrades.get(studentName).add(grade);

            }else {
               studentsGrades.put(studentName, new ArrayList<>());
               studentsGrades.get(studentName).add(grade);
            }
        }
        for (Map.Entry<String, List<Double>> entry : studentsGrades.entrySet()) {
             String studentName = entry.getKey();
             List <Double> grades = entry.getValue();

//             double gradeSum = grades.stream().mapToDouble(Double::doubleValue).sum();

             double sum = 0;
            for (Double grade: grades) {
                sum += grade;
            }
            double averageGrade = sum / grades.size();

            if (averageGrade >= 4.50){
                System.out.printf("%s -> %.2f%n", studentName, averageGrade);
            }
        }
    }
}
