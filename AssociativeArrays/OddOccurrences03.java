package AssociativeArrays;

import java.util.*;

public class OddOccurrences03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] inputArr = scanner.nextLine().split(" ");

        LinkedHashMap<String, Integer> wordMap = new LinkedHashMap<>();

        for (String word : inputArr) {
            word = word.toLowerCase();
            //правим малки букви

            wordMap.putIfAbsent(word, 0);
            // това е команда, която казва, че ако дадения ключ го няма, го постави.
            // в този случай value-то няма да се ъпргейдва и да се заменя със следваща стойност
            wordMap.put(word, wordMap.get(word) + 1);
            // ако ключа го има вече, увеличи/брой стойността + 1

            // Втори вариант:
//            if (wordMap.containsKey(word)){
//                wordMap.put(word, wordMap.get(word) + 1);
//            } else {
//                wordMap.put(word, 1);
//            }
        }
        ArrayList<String> resultList = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : wordMap.entrySet()) {
            if (entry.getValue() % 2 != 0){
                resultList.add(entry.getKey());
            }
        }
        System.out.println(String.join(", ", resultList));
    }
}
