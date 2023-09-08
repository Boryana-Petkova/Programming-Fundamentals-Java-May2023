package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class Demo07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] numbersArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        //2 1 1 2 3 3 2 2 2 1
        int maxLength = 1; // винаги ще е поне 1 дължина
        int leftSequence = 1;
        int startIndex = 0;
        int newStartPoint = 0;
        for (int i = 0; i < numbersArr.length; i++) {

            if (i == numbersArr.length -1){ // ако е последно, не сравнявай повече нататък
                break;
            }
            int currentNum = numbersArr[i];
            int currentNextNum = numbersArr[i + 1];

            if (currentNum == currentNextNum){
                leftSequence ++;
            } else {
               leftSequence = 1; // дължината я връщаме на първоначална позиция
               startIndex = i + 1; // оказваме начален индекс от следващия,
                                // този i очевидно не е еднакъв със следващия,
                            // като стартовата позиция на най-дълга поредица се пази отделно,
                            // тя не се променя автоматично
            }
            if (leftSequence > maxLength){ // ако поредицата е по-дълга от предишната,
                maxLength = leftSequence; // вече тя става най-дългата
                newStartPoint = startIndex; // и стартовия индекс заема новата позиция
            }
        }
        for (int i = newStartPoint; i < newStartPoint + maxLength ; i++) {
            System.out.print(numbersArr[i] + " ");
        }
    }
}
