package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> numbersArr = Arrays.stream(scanner.nextLine()
                        .split("\\s+"))
                .collect(Collectors.toList());

        String[]command = scanner.nextLine().split("\\s+");
        String bomb = command[0];
        int power = Integer.parseInt(command[1]);

            while (numbersArr.contains(bomb)){
                int elementIndex = numbersArr.indexOf(bomb);

                int left = Math.max(0, elementIndex - power);
                int right = Math.min(elementIndex + power, numbersArr.size() - 1);

                for (int i = right; i >= left; i--) {
                numbersArr.remove(i);
                }
            }
        System.out.println(numbersArr.stream().mapToInt(Integer::parseInt).sum());
    }
}
