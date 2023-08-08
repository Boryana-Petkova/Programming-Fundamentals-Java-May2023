package Lists;

import java.util.*;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numberList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Collections.sort(numberList);
        Collections.reverse(numberList);

            System.out.println(numberList.toString().replaceAll("[\\[\\],]", ""));
    }
}


