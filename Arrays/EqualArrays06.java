package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] firstArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] secondtArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int sum = 0;
        int index = 0;
        boolean isIndentical = true;
        for (int i = 0; i < firstArr.length; i++) {
            int firstNum = firstArr[i];
            int secondNum = secondtArr[i];
            if (firstNum != secondNum){
                isIndentical = false;
                index = i;
                break;
            } else {
                sum += firstNum;
            }
        }
        if (isIndentical) {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        } else {
            System.out.printf("Arrays are not identical. " +
                    "Found difference at %d index.", index);
        }
    }
}
