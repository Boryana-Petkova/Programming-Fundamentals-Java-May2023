package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 0; i <= numbers.length - 1; i++) {
            int currentElement = numbers[i];

            if (i == numbers.length - 1) { // слагаме i а не currentNum, защото второто е стойност,
                                         // докато i е индекс и може да се сравни с последния индекс
                System.out.print(currentElement + " ");
                break;
            }
            boolean isTop = false;
            for (int j = i + 1; j <= numbers.length - 1; j++) { // сравняваме с всички дясностоящи числа
                int nextElement = numbers[j];
                if (currentElement > nextElement) {
                    isTop = true;
                } else {
                    isTop = false;
                    break;
                }
            }
                if (isTop){
                    System.out.print(currentElement + " "); // принтираме топ числата просто,
                    // не ги поставяме в масив, и без това дължината му не може да се променя
            }
        }
    }
}


