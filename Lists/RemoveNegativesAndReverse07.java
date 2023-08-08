package Lists;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverse07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numberList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        numberList.removeIf(e -> e < 0);
        // премахни всички елементи, които отговарят на горното условие
        Collections.reverse(numberList);
        // подреждаме в обратен ред

        if (numberList.size() == 0){
            System.out.println("empty");

        } else {
            System.out.println(numberList.toString().replaceAll("[\\[\\],]", ""));
        // принтираме инт чрез Стринг за удобство, но премахваме скоби и запетаи
        }
    }
}
