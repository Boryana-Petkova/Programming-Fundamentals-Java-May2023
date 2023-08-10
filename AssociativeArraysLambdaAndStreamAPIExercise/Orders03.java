package AssociativeArraysLambdaAndStreamAPIExercise;

import java.util.*;

public class Orders03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, Integer> productQuantity = new LinkedHashMap<>();
        Map<String, Double> productPrice = new LinkedHashMap<>();

        while (!input.equals("buy")){
            String [] productData = input.split(" ");
            String product = productData[0];
            Double price = Double.parseDouble(productData[1]);
            int quantity = Integer.parseInt(productData[2]);

            if (!productQuantity.containsKey(product)){
                productQuantity.put(product, quantity);
            } else {
                int currentQuantity = productQuantity.get(product);
                productQuantity.put(product, currentQuantity + quantity);
            }

            productPrice.put(product, price);

            input = scanner.nextLine();
        }
        for (Map.Entry <String, Integer> entry : productQuantity.entrySet()) {
            //обхождане на map
            String name = entry.getKey();
            Double sum = productQuantity.get(name) * productPrice.get(name);
            System.out.printf("%s -> %.2f%n", name, sum);
        }


    }
}
