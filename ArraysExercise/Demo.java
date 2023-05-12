package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class proba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        String[] inputArr = scanner.nextLine().split(" ");
//        int n = Integer.parseInt(scanner.nextLine());
//
//        for (int i = 1; i <= n ; i++) {
//            String firstElement = inputArr[0];
//
//            for (int index = 0; index < inputArr.length - 1; index++) {
//                inputArr[index] = inputArr[index + 1];
//            }
//            inputArr[inputArr.length - 1] = firstElement;
//        }
//        for (String elements: inputArr) {
//            System.out.print(elements + " ");
//        }

        int [] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        String[] resultArr = new String[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            resultArr[i] = String.valueOf(numbers[i]);

            System.out.print(String.join(", ", resultArr));

        }
    }
}

