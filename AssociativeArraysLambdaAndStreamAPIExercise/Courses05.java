package AssociativeArraysLambdaAndStreamAPIExercise;

import java.util.*;

public class Courses05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, List<String>> courseMap = new LinkedHashMap<>();
        while (!input.equals("end")){
            String [] productData = input.split(" : ");
            String course = productData[0];
            String student = productData[1];

            if (!courseMap.containsKey(course)) {
                courseMap.put(course, new ArrayList<>());
                courseMap.get(course).add(student);
            } else {
                courseMap.get(course).add(student);
            }
            input = scanner.nextLine();
        }
        courseMap.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + ": " + entry.getValue().size());
            entry.getValue().forEach(student -> System.out.println("-- " + student));
        });
        // два реда принтиране от един мап
        // и броене на студентите към курса

    }
}
