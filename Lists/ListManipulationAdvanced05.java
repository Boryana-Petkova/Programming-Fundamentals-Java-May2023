package Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numberList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String lineInput = scanner.nextLine();

        while (!lineInput.equals("end")){
            String[] commandArr = lineInput.split(" ");
            String command = commandArr[0];
            String secondCommand = commandArr[1];

            if(command.equals("Contains")) {
                int num = Integer.parseInt(commandArr[1]);
                if (numberList.contains(num)) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No such number");
                }
            }else if (command.equals("Print")) {

                if (secondCommand.equals("even")){
                for (int i = 0; i < numberList.size(); i++) {
                    int numEven = numberList.get(i);
                    if (numEven % 2 == 0) {
                        System.out.print(numEven + " ");
                    }
                }
                    System.out.println();
            } else if (secondCommand.equals("odd")) {
                    for (int i = 0; i < numberList.size(); i++) {
                        int numOdd = numberList.get(i);
                        if (numOdd % 2 != 0) {
                            System.out.print(numOdd + " ");
                        }
                    }
                    System.out.println();
                }
            } else if (command.equals("Get")) {
                if (secondCommand.equals("sum")) {
                    int sum = 0;
                    for (int item : numberList) {
                        sum += item;
                    }
                    System.out.println(sum);
                }
            } else if (command.equals("Filter")) {
                if (secondCommand.equals("<")) {
                    int numCommand = Integer.parseInt(commandArr[2]);
                    for (int item : numberList) {
                        if (item < numCommand) {
                            System.out.print(item + " ");
                        }
                    }
                    System.out.println();

                } else if (secondCommand.equals(">")) {
                    int numCommand = Integer.parseInt(commandArr[2]);
                    for (int item : numberList) {
                        if (item > numCommand) {
                            System.out.print(item + " ");
                        }
                    }
                    System.out.println();

                } else if (secondCommand.equals("<=")) {
                    int numCommand = Integer.parseInt(commandArr[2]);
                    for (int item : numberList) {
                        if (item <= numCommand) {
                            System.out.print(item + " ");
                        }
                    }
                    System.out.println();
                } else if (secondCommand.equals(">=")) {
                    int numCommand = Integer.parseInt(commandArr[2]);
                    for (int item : numberList) {
                        if (item >= numCommand) {
                            System.out.print(item + " ");
                        }
                    }
                    System.out.println();
                }
            }
                    lineInput = scanner.nextLine();
        }
    }
}
