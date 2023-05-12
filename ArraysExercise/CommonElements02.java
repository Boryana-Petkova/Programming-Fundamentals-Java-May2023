package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class CommonElements02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] firstValuesArr = scanner.nextLine().split(" ");
        String[] secondValuesArr = scanner.nextLine().split(" ");

        for (String secondElements: secondValuesArr) {
            for (String firstElements: firstValuesArr) {
                if (secondElements.equals(firstElements)){
                    System.out.print(secondElements + " ");
                    break;
                }
            }

        }

    }
}
