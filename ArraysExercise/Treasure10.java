package ArraysExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Treasure10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> initialLoot = Arrays.stream(scanner.nextLine().split("\\|"))
                .collect(Collectors.toList());

        String line = scanner.nextLine();

        while (!"Yohoho!".equals(line)) {
            List<String> treasure = Arrays.stream(line.split("\\s+")).collect(Collectors.toList());
            String command = treasure.get(0);

            switch (command) {
                case "Loot":
                    for (int i = 1; i < treasure.size(); i++) {
                        if (!initialLoot.contains(treasure.get(i))) {
                            initialLoot.add(0, treasure.get(i));
                        }
                    }

                    break;
                case "Drop":
                    int index = Integer.parseInt(treasure.get(1));

                    if (index >= 0 && index < initialLoot.size()) {
                        String item = initialLoot.get(index);
                        initialLoot.remove(index);
                        initialLoot.add(item);
                    }

                    break;
                case "Steal":
                    int count = Integer.parseInt(treasure.get(1));

                    if (count > initialLoot.size()) {
                        count = initialLoot.size();
                    }

                    List<String> subList = initialLoot.subList(initialLoot.size() - count, initialLoot.size());
                        // нов лист, за да кажем от кой индекс до кой ще трием
                    System.out.println(String.join(", ", subList));
                    // първо принтираме тези, които ще трием, тоест сублиста
                    initialLoot = initialLoot.subList(0, initialLoot.size() - count);
                    // стария лист е равен на нов сублист,
                    // който е от 0 до индекса, след който трием съответните брой индекси

                    break;
            }
            // друг по-дълъг вариант на последната команда и итерациите й:
            /*List<String> deleteNames = new ArrayList<>();
                for (int i = itemsArr.size() - count; i >= 0; i++) {
                        if (i >= 0 && i < itemsArr.size()){
                            deleteNames.add(itemsArr.get(i));
                            itemsArr.remove(i);
                            i--;
                        } else {
                            break;
                        }
                }*/
            //System.out.println(String.join(", ", deleteNames));

            line = scanner.nextLine();
        }

        if (!initialLoot.isEmpty()) {
            int sumLengthItem = 0;

            for (String currentItem : initialLoot) {
                sumLengthItem += currentItem.length();
            }

            double averageGain = sumLengthItem * 1.0 / initialLoot.size();

            System.out.printf("Average treasure gain: %.2f pirate credits.%n", averageGain);
        } else {
            System.out.println("Failed treasure hunt.");
        }
    }
}

