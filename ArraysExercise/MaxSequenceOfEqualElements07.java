package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int maxLength = 0;
        int length = 1; 

        int startIndex = 0;
        int newStart = 0;

        for (int i = 1; i < numbers.length; i++) {
            if(numbers[i] == numbers[i - 1]) {
                length++;
            } else { 
                length = 1;
                startIndex = i; 
            }

            if(length > maxLength) { 
                maxLength = length;
                newStart = startIndex;
            }
        }

        for (int i = newStart; i < newStart + maxLength; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
