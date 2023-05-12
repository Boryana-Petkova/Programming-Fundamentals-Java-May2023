package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class Train01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countWagons = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int[] wagons = new int[countWagons];
        for (int wagon = 0; wagon <= countWagons - 1 ; wagon++) {
            int people = Integer.parseInt(scanner.nextLine());
            wagons[wagon] = people;

        }
        for (int index = 0; index <= wagons.length - 1 ; index++) {
            int currentElement = wagons[index];
            sum += currentElement;
            System.out.print(currentElement + " ");
        }
        System.out.println();
        System.out.println(sum);
    }
}
