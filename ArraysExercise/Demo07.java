package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class Demo07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int length = 1;
        int maxLength = 0;
        int startIndex = 0;
        int newStartIndex = 0;

        for (int index = 1; index <= numbers.length -1 ; index++) {
            if (numbers[index] == numbers[index - 1]){
                length ++;
            } else {
                length = 1;
                startIndex = index;
            }
            if (length > maxLength){
                maxLength = length;
                newStartIndex = startIndex;
            }
        }
        for (int index = newStartIndex; index < newStartIndex + maxLength ; index++) {
            System.out.print(numbers[index] + " ");
        }
    }
}
