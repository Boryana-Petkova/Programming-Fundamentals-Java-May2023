package Students04;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Student> studentsList = new ArrayList<>();

        for (int i = 1; i <= n ; i++) {
            String data = scanner.nextLine();
            String firstName = data.split(" ")[0];
            String lastName = data.split(" ")[1];
            double grade = Double.parseDouble(data.split(" ")[2]);
            Student student = new Student(firstName, lastName, grade);
            studentsList.add(student);
        }
        Collections.sort(studentsList, Comparator.comparingDouble(Student::getGrade).reversed());

        for (Student student: studentsList  ) {
            System.out.printf("%s %s: %.2f%n", student.getFirstName(), student.getLastName(), student.getGrade());
        }
    }
}
