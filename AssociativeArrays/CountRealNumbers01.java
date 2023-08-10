package AssociativeArrays;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountRealNumbers01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numbersArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToDouble(Double::parseDouble)
                .toArray();

        TreeMap<Double, Integer> countMap = new TreeMap<>();

        // изписваме numbersArr и с десен клавиш Алт и Ентър и създаваме foreach-a
//        for (double num : numbersArr) {
//            if (!countMap.containsKey(num)){
//                countMap.put(num, 0);
//            }
//            countMap.put(num, countMap.get(num) + 1);
//            // добавяме число, но с увеличена стойност от 0 плюс едно
//          }

        for (double num : numbersArr) {
            if (countMap.containsKey(num)) {
                int currentValue = countMap.get(num);
                countMap.put(num, currentValue + 1);

            } else {
                countMap.put(num, 1);
            }
        }
                for (Map.Entry<Double, Integer> entry : countMap.entrySet()) {
                    System.out.printf("%.0f -> %d%n", entry.getKey(), entry.getValue());
                }

    }
}
