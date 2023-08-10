package AssociativeArraysLambdaAndStreamAPIExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String resourceInput = scanner.nextLine();
        Map<String, Integer> resourceQuantity = new LinkedHashMap<>();

        while (!resourceInput.equals("stop")){
            int quantity = Integer.parseInt(scanner.nextLine());

            if (resourceQuantity.containsKey(resourceInput)){
                int currentQuantity = resourceQuantity.get(resourceInput);
                resourceQuantity.put(resourceInput, currentQuantity + quantity);
            } else {
                resourceQuantity.put(resourceInput, quantity);
            }

            resourceInput = scanner.nextLine();


        }
        resourceQuantity.entrySet().forEach(entry ->
                System.out.println(entry.getKey() + " -> " + entry.getValue()));
    }
}
