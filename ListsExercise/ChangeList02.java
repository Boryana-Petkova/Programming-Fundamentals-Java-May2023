package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersArr = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String lineInput = scanner.nextLine();
        while (!lineInput.equals("end")){
            String[] commandArr = lineInput.split(" ");
            String command = commandArr[0];

            switch (command){
                case "Delete":
                    int numRemove = Integer.parseInt(commandArr[1]);
                    numbersArr.removeAll(Arrays.asList(numRemove));
                    break;
                case "Insert":
                    int element = Integer.parseInt(commandArr[1]);
                    int index = Integer.parseInt(commandArr[2]);
                    numbersArr.add(index, element);
                    break;
            }
            lineInput = scanner.nextLine();
        }
        System.out.println(numbersArr.toString().replaceAll("[\\[\\],]",""));
    }
}
