package AssociativeArraysLambdaAndStreamAPIExercise;

import java.util.*;

public class CompanyUsers08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, List<String>> companiesMap = new LinkedHashMap<>();
        while (!input.equals("End")){

            String [] companyData = input.split(" -> ");
            String company = companyData[0];
            String employeeId = companyData[1];

            if (!companiesMap.containsKey(company)){ // ако компанията я няма в листа
            companiesMap.put(company, new ArrayList<>());
            // първо добавяме новата компания и нов лист
            companiesMap.get(company).add(employeeId);
            // после казваме -> на тази компания му добави служителя в листа
            }
            if (!companiesMap.get(company).contains(employeeId)){ // ако служителя го няма в листа
                companiesMap.get(company).add(employeeId); // го добавяме
            }

            input = scanner.nextLine();
        }
        // първи вариант принтиране на няколко реда
        /*companiesMap.entrySet().forEach(entry -> {
            System.out.println(entry.getKey());
            entry.getValue().forEach(employeeId -> System.out.println("-- " + employeeId));
        });*/
        // принтираме първо компанията и към нея всички служители
        // Втори вариант принтиране на няколко реда:
        companiesMap.entrySet().stream()
                .forEach(c -> {
                    System.out.printf("%s%n", c.getKey());
                    c.getValue().forEach(e -> System.out.printf("-- %s%n", e));
                });
    }
}
