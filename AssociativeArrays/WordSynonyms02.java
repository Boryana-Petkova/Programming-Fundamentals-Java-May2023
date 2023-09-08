package AssociativeArrays;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class WordSynonyms02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        LinkedHashMap <String, ArrayList<String>> wordsMap = new LinkedHashMap<>();

        for (int i = 1; i <= n ; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();

            if (!wordsMap.containsKey(word)){
                wordsMap.put(word, new ArrayList<>());
                //създаваме лист в Мап-а тук, за да добавяме синоними
            }
            // тук добавяме синоними, и да имаме и да нямаме думата в мап-а
            wordsMap.get(word).add(synonym);
            // с get ние достъпваме value-то или в случая листа и добавяме нов синоним
        }
        for (Map.Entry<String, ArrayList<String>> entry : wordsMap.entrySet()) {
            String keyMap = entry.getKey();
            ArrayList<String> synonymsList = entry.getValue();
            // така правим променлива и взимаме синонимите
            System.out.printf("%s - %s%n", keyMap, String.join(", ", synonymsList));
            // така принтираме листа със синонимите
        }
    }
}
