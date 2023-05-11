package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOddSubtraction05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numsArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(e ->Integer.parseInt(e))
                .toArray();
        int evenSum = 0;
        int oddSum = 0;
        for (int item : numsArr) {
            if (item % 2 == 0) {
                evenSum += item;
            } else {
                oddSum += item;
        }
    }
        int totalSum = evenSum - oddSum;
        System.out.println(totalSum);
    }
}
