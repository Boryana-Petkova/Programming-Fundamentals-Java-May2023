package AssociativeArraysLambdaAndStreamAPIExercise;

import java.util.*;

public class SoftUniExamResults10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, Integer> usersMapPoints = new LinkedHashMap<>();
        Map<String, Integer> langMapCount = new LinkedHashMap<>();


        while (!input.equals("exam finished")){
            String []textData = input.split("-");
            String userName = textData[0];


            if (input.contains("banned")) {
                usersMapPoints.remove(userName);

            } else {
                String language = textData[1];
                int points = Integer.parseInt(textData[2]);

                if (!usersMapPoints.containsKey(userName)) { // ако го няма участника
                    usersMapPoints.put(userName, points);
                } else {
                    int currentPoint = usersMapPoints.get(userName);
                    if (currentPoint > points) {
                        usersMapPoints.put(userName, currentPoint);
                    } else {
                        usersMapPoints.put(userName, points);
                    }
                }

                if (!langMapCount.containsKey(language)){ // ако няма този език
                    langMapCount.put(language, 1);
                }else{
                    int currentCount = langMapCount.get(language);
                    langMapCount.put(language, currentCount + 1);
                }
            }

            input = scanner.nextLine();
        }
        System.out.println("Results:");
        usersMapPoints.entrySet().forEach(entry-> System.out.println(entry.getKey() + " | " + entry.getValue()));
        System.out.println("Submissions:");
        langMapCount.entrySet().forEach(entryCounts -> System.out.println(entryCounts.getKey() + " - " + entryCounts.getValue()));

    }
}
