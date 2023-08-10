package AssociativeArraysLambdaAndStreamAPIExercise;

import java.util.*;

public class StudentAcademy06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> studentGrades = new LinkedHashMap<>();

        for (int i = 1; i <= n ; i++) {
            String nameStudent = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());
            if (studentGrades.containsKey(nameStudent)){
                List<Double> currentGrade = studentGrades.get(nameStudent);
                // правим променлива currentGrade в новия лист на мап-а, казвайки, че го поставяме на value
                currentGrade.add(grade);
                // прибавяме следващата оценка чрез променлива, която се съхранява в листа Double на мап-а

            } else {
                studentGrades.put(nameStudent, new ArrayList<>());
                // първо добавяме новия студент и нов лист
                studentGrades.get(nameStudent).add(grade);
                // после казваме - на този същия студент му добави оценката в листа
            }
        }
        Map<String, Double> studentAverageGrade = new LinkedHashMap<>();
        // ще съхраняваме студенти с изчислена средна оценка >= 4.50

        for (Map.Entry <String, List<Double>> entry: studentGrades.entrySet()) {
            // обхождаме първия лист със студенти и техните списъци с оценки,
            // за да търсим средна оценка >= 4.50, като за тази цел долу
            // правим метод за намиране на средна оценка на всеки студент

            String studentName = entry.getKey(); // всеки студент
            List<Double> grades = entry.getValue(); // оценки на всеки студент
            double averageGrades = getAverageGrade(grades); // ще сложим изчислената средна оценка

            if (averageGrades >= 4.50) {
                studentAverageGrade.put(studentName, averageGrades);
            }
        }
            studentAverageGrade.entrySet().forEach(entry1 -> System.out.printf("%s -> %.2f%n", entry1.getKey(), entry1.getValue()));

    }
    private static double getAverageGrade(List<Double> grades) {
        // намиране на средна оценка на студент
        double sum = 0;
        for (double grade: grades ) {
            sum += grade;
        }
        return sum / grades.size();//делим на размера на листа, което е всъщност броя на оценките
    }
}
