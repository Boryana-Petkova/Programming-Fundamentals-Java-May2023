package AssociativeArrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> airplanesMap = new HashMap<>();
        airplanesMap.put("Boing", 300);
        airplanesMap.put("Zee", 200);
        airplanesMap.put("Davos", 10);
        airplanesMap.put("Re", 34);

        if (!airplanesMap.containsKey("Re 00")){
            airplanesMap.put("Re 00", 2);
        }
        // създаваме foreach-a като пишем airplanesMap.entrySet()
        // и натискаме Alt and Enter, избираме Iterate, и му даваме име, примерно entry
        for (Map.Entry<String, Integer> entry : airplanesMap.entrySet()) {
            String mapKey = entry.getKey();
            int mapValue = entry.getValue();
        }
    }
}
