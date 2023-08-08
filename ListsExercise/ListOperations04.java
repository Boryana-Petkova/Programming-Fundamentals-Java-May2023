package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersArr = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String command = scanner.nextLine();
        while (!command.equals("End")) {

            if (command.contains("Add")) {
                int num = Integer.parseInt(command.split("\\s+") [1]);
                numbersArr.add(num);
            } else if (command.contains("Insert")) {
                int number = Integer.parseInt(command.split("\\s+")[1]);
                int index = Integer.parseInt(command.split("\\s+")[2]);
                if (isValidIndex(index, numbersArr)) {
                    numbersArr.add(index, number);
                } else {
                    System.out.println("Invalid index");
                }
            } else if (command.contains("Remove")) {
                int indexRemove = Integer.parseInt(command.split("\\s+")[1]);
                if (isValidIndex(indexRemove, numbersArr)) {
                    numbersArr.remove(indexRemove);
                } else {
                    System.out.println("Invalid index");
                }
            } else if (command.contains("Shift left")) {
                int count = Integer.parseInt(command.split("\\s+")[2]);
                for (int i = 1; i <= count; i++) {
                    int firstNum = numbersArr.get(0);
                    numbersArr.remove(0);
                    numbersArr.add(firstNum);
                }
            } else if (command.contains("Shift right")) {
                int countRight = Integer.parseInt(command.split("\\s+")[2]);
                for (int i = 1; i <= countRight; i++) {
                    int RightNum = numbersArr.get(numbersArr.size() - 1);
                    numbersArr.remove(numbersArr.size() - 1);
                    numbersArr.add(0, RightNum);
                }
            }
            command = scanner.nextLine();
        }

        for (int item: numbersArr) {
            System.out.print(item + " ");
        }
    }
        public static boolean isValidIndex ( int index, List<Integer > numbersArr){
            return index >= 0 && index <= numbersArr.size() - 1;
    }
}

