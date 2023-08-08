package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbersArr = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        int capacityEveryWagon = Integer.parseInt(scanner.nextLine());
        String lineInput = scanner.nextLine();
        while (!lineInput.equals("end")){
            String[] commandArr = lineInput.split("\\s+");

            if (commandArr[0].equals("Add")) {
                int passengers = Integer.parseInt(commandArr[1]);
                numbersArr.add(passengers);
            } else {
                int passengers = Integer.parseInt(commandArr[0]);
                for (int index = 0; index <= numbersArr.size()-1; index++) {
                    int currentWagon = numbersArr.get(index);
                    if (currentWagon + passengers <= capacityEveryWagon){
                        numbersArr.set(index, currentWagon + passengers);
                        break;
                    }
                }
            }
                lineInput = scanner.nextLine();
        }
        for (int item: numbersArr) {
            System.out.print(item + " ");
        }
    }
}
