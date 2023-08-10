package AssociativeArraysLambdaAndStreamAPIExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countCommand = Integer.parseInt(scanner.nextLine());

        Map<String, String> parkingData = new LinkedHashMap<>();
        // userName, PlateNumber

        for (int i = 1; i <= countCommand; i++) {
            String command = scanner.nextLine();
            String[] commandParts = command.split(" ");
            String commandName = commandParts[0];
            String userName = commandParts[1];

            if (commandName.equals("register")) {

                String licensePlateNumber = commandParts[2];
                if (parkingData.containsKey(userName)) {
                    System.out.printf("ERROR: already registered with plate number %s%n", licensePlateNumber);
                } else {
                    parkingData.put(userName, licensePlateNumber);
                    System.out.printf("%s registered %s successfully%n", userName, licensePlateNumber);
                }
            } else if (commandName.equals("unregister")) {
                if (parkingData.containsKey(userName)) {
                    parkingData.remove(userName);
                    System.out.printf("%s unregistered successfully%n", userName);
                } else {
                    System.out.printf("ERROR: user %s not found%n", userName);
                }
            }
        }

        //parkingData.forEach((key, value) -> System.out.println(key + " => " + value));
        //OR
        parkingData.entrySet().forEach(entry -> System.out.println(entry.getKey() + " => " + entry.getValue()));

    }
}
