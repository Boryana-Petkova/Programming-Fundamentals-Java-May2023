package Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList1 = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> numList2 = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> resultList = new ArrayList<>();
        int minSize = Math.min(numList1.size(), numList2.size());
        for (int i = 0; i < minSize; i++) {
            int firstNum = numList1.get(i);
            int secondNum = numList2.get(i);

            resultList.add(firstNum);
            resultList.add(secondNum);
        }
        if (numList1.size() > numList2.size()){
            resultList.addAll(numList1.subList(minSize, numList1.size()));
        } else {
            resultList.addAll(numList2.subList(minSize, numList2.size()));
        }
        System.out.println(resultList.toString().replaceAll("[\\[\\],]", ""));
    }
}
