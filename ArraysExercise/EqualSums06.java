package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        //1 2 3 3
        for (int i = 0; i < numbers.length; i++) {

            int leftSum = 0;
            for (int j = 0; j < i; j++) {
                leftSum += numbers[j];
            }
            int rightSum = 0;
            for (int j = i + 1; j < numbers.length; j++) {
                rightSum += numbers[j];
            }
            if (leftSum == rightSum) {
                System.out.println(i);
                return; //прекъсвам цялата програма, за да не ми изпише и долния принт
                            // след прочитането на този
            }
        }
            //обхождила съм всички числа в масива, но нито едно не отговаря на условието и принтирам
            System.out.println("no");

    }
}

