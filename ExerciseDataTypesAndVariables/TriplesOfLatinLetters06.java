package ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class TriplesOfLatinLetters06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine()); //букви,
        // първите две, или първите три букви и т.н

        for (int i = 0; i <n ; i++) {
            char first = (char) ('a' + i);
            for (int j = 0; j <n ; j++) {
                char second = (char) ('a' + j);
                for (int k = 0; k <n ; k++) {
                    char third = (char) ('a' + k);
                    System.out.print("" + first + second + third);
                    System.out.println();
                }
            }
        }
    }
}