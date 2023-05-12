package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int magicSum = Integer.parseInt(scanner.nextLine());

        for (int index = 0; index <= numbersArr.length - 1 ; index++) {
            int num = numbersArr[index];
            for (int inIndex = index + 1; inIndex <= numbersArr.length - 1 ; inIndex++) {
                int nextNum = numbersArr[inIndex];
                if (num + nextNum == magicSum){
                    System.out.println(num + " " + nextNum);
                }

                }
            }

    }
}
