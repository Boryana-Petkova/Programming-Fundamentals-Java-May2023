package AssociativeArraysLambdaAndStreamAPIExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LegendaryFarming07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> materials = new LinkedHashMap<>();
        // в началото знаем, че имаме имената на материалите,
        // и ги въвеждаме в един нов мап, с 0 стойност, за момента
        materials.put("shards", 0);
        materials.put("fragments", 0);
        materials.put("motes", 0);

        Map<String, Integer> junks = new LinkedHashMap<>();

        boolean isWin = false;
        while (!isWin) {
            String input = scanner.nextLine();
            String[] inputData = input.split("\\s+");
            for (int i = 0; i < inputData.length; i += 2) {
                //обхождаме през 2, защото елементите са количество и материал
                int nextQuantity = Integer.parseInt(inputData[i]);
                String material = inputData[i + 1].toLowerCase();

                if (material.equals("shards") || material.equals("fragments") || material.equals("motes")) {
                    int currentQuantity = materials.get(material);
                    materials.put(material, currentQuantity + nextQuantity);
                } else if (junks.containsKey(material)) {
                        int currentQuantity = junks.get(material);
                        junks.put(material, currentQuantity + nextQuantity);
                } else {
                    junks.put(material, nextQuantity);
                }

                // преди да приключи while цикъла проверяваме дали са събрани 250 за всеки материал
                if (materials.get("shards") >= 250) {
                    System.out.println("Shadowmourne obtained!");
                    materials.put("shards", materials.get("shards") - 250);
                    isWin = true;
                    break;
                } else if (materials.get("fragments") >= 250) {
                    System.out.println("Valanyr obtained!");
                    materials.put("fragments", materials.get("fragments") - 250);
                    isWin = true;
                    break;
                } else if (materials.get("motes") >= 250) {
                    System.out.println("Dragonwrath obtained!");
                    materials.put("motes", materials.get("motes") - 250);
                    isWin = true;
                    break;
                }
            }

            if (isWin) {
                break;
            }
        }
        materials.entrySet().forEach(entry -> System.out.println(entry.getKey()+ ": " + entry.getValue()));
        junks.entrySet().forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }
}
