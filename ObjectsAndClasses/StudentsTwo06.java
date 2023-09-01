package ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentsTwo06 {
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

            public void setAge(String age) {
                this.age = age;
            }

            public void setHometown(String hometown) {
                this.hometown = hometown;
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

                if (isStudentExisting(studentsArr, firstNameInput, lastNameInput)){
                    int index = getExistingIndex(studentsArr,firstNameInput, lastNameInput);
                    studentsArr.get(index).setAge(ageInput);
                    studentsArr.get(index).setHometown(hometownInput);

                } else {
                    Student currentStudent = new Student(firstNameInput, lastNameInput, ageInput, hometownInput);
                    studentsArr.add(currentStudent);
                }

                input = scanner.nextLine();
            }
            String city = scanner.nextLine();
            for (Student object: studentsArr) {
                if (object.getHometown().equals(city)) {
                    System.out.printf("%s %s is %s years old%n", object.getFirstName(), object.getLastName(), object.getAge());

                }
            }
    }
    public static boolean isStudentExisting (List<Student> students, String firstName, String lastName){
        for (Student object: students) {
            if (object.getFirstName().equals(firstName)&& object.getLastName().equals(lastName)){
                return true;
            }
        }
        return false;
    }
    public static int getExistingIndex (List<Student> studentsArr, String firstName, String lastName){
            int index = -1;
            for (int i = 0; i < studentsArr.size(); i++) {
            Student object = studentsArr.get(i);
            if (object.getFirstName().equals(firstName)&& object.getLastName().equals(lastName)){
                index = i;
            }
        }
            return index;
    }
}
