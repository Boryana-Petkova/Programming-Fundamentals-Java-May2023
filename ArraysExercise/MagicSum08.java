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

        for (int i = 0; i < numbersArr.length; i++) {
            int num = numbersArr[i];
            for (int j = i + 1; j < numbersArr.length; j++) {
                int nextNum = numbersArr[j];
                if (num + nextNum == magicSum){
                    System.out.println(num + " " + nextNum);
                }
            }
        }
    }
}
