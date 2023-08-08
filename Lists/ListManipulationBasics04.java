package Lists;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numberList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String lineInput = scanner.nextLine();
        while (!lineInput.equals("end")) {
            String[] currentCommandArr = lineInput.split(" ");
            String command = currentCommandArr[0];

            switch (command) {
                case "Add":
                    int numAdd = Integer.parseInt(currentCommandArr[1]);
                    //пръво изваждаме числото от цялата команда, което е на индекс 1,
                    // и за да сложим после число някъде, го направим целочислено,
                    // тоест в инт променлива
                    numberList.add(numAdd);
                    // прибавяме числото към листа
                    break;
                case "Remove":
                    int numRemove = Integer.parseInt(currentCommandArr[1]);
                    numberList.remove(Integer.valueOf(numRemove));
                    // оказваме да премахнем елемент, но превръщайки
                    // целочислено число в референтна стойност
                    break;
                case "RemoveAt":
                    int indexRemove = Integer.parseInt(currentCommandArr[1]);
                    numberList.remove(indexRemove);
                    // тук търсим индекса, за да премахнем елемента
                    break;
                case "Insert":
                    int numInsert = Integer.parseInt(currentCommandArr[1]);
                    int indexGiven = Integer.parseInt(currentCommandArr[2]);
                    numberList.add(indexGiven, numInsert);
                    break;
            }

            lineInput = scanner.nextLine();
        }
        System.out.println(numberList.toString().replaceAll("[\\[\\],]", ""));
// OR THIS VERSION:
//        for (int item: numberList) {
//            System.out.print(item + " ");
//          }
    }
}
