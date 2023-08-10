package AssociativeArraysLambdaAndStreamAPIExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //String input = scanner.nextLine().replaceAll(" ", "");
        // но без долу проверката за ' ';
        //OR
        String input = scanner.nextLine();
        Map<Character, Integer> symbolsCount = new LinkedHashMap<>();

        for (char symbol: input.toCharArray()) {
            // правя input-а на масив от char-ове, за да го обходя
            if (symbol == ' '){
                continue;
                //continue казва да пропуснем надолу проверките
                // и да мине на следващия символ
            }
            if (symbolsCount.containsKey(symbol)){
                int currentCount = symbolsCount.get(symbol);
                symbolsCount.put(symbol, currentCount + 1);
            }
            else {
                symbolsCount.put(symbol, 1);
            }
        }
        //for (Map.Entry <Character, Integer> entry : symbolsCount.entrySet()) {
            //обхождане на map
            //System.out.println(entry.getKey() + " -> " + entry.getValue());
        //}

        //Втори вариант за обхождане и принтиране на map:
        symbolsCount.forEach((key, value) -> System.out.println(key + " -> " + value));
    }
}
