package ObjectsAndClasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Students05 {

    static class Student {
        //first name, last name, age, and hometown.
        String firstName;
        String lastName;
        String age;
        String hometown;

        public Student (String firstName, String lastName, String age, String hometown){
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.hometown = hometown;
        }
        public String getFirstName() {
            return this.firstName;
        }
        public String getLastName() {
            return this.lastName;
        }
        public String getAge() {
            return this.age;
        }
        public String getHometown() {
            return this.hometown;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Student> studentsArr = new ArrayList<>();
        while (!input.equals("end")) {

            String[] studentsInput = input.split(" ");
            String firstNameInput = studentsInput[0];
            String lastNameInput = studentsInput[1];
            String ageInput = studentsInput[2];
            String hometownInput = studentsInput[3];

            Student currentStudent = new Student(firstNameInput, lastNameInput, ageInput, hometownInput);
            studentsArr.add(currentStudent);

            input = scanner.nextLine();
        }
        String city = scanner.nextLine();
        for (Student object: studentsArr) {
            if (object.getHometown().equals(city)) {
                System.out.printf("%s %s is %s years old%n", object.getFirstName(), object.getLastName(), object.getAge());

            }
        }
    }
}
