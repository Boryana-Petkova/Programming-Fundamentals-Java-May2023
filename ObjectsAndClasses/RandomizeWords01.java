package ObjectsAndClasses;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomizeWords01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String [] wordArr = input.split(" ");

        Random rndGenerator = new Random();
        for (int i = 0; i < wordArr.length; i++) {

            int indexX = rndGenerator.nextInt(wordArr.length);
            int indexY = rndGenerator.nextInt(wordArr.length);
            // избираме nextInt (bound), за да зададем крайна граница, примерно
            // ако масив е с дължина 5, то раднъм ще взима само от 0 до 4 вкл.

            String oldIndex = wordArr[indexX];
            wordArr[indexX] = wordArr[indexY];
            wordArr[indexY] = oldIndex;

        }
        System.out.println(String.join(System.lineSeparator(), wordArr));
            // формат за нов ред е LineSeparator
    }
}
