package ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class SumOfChars04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int count = 1; count <= n ; count++) {
            char symbol = scanner.nextLine().charAt(0);

            int asciiCode = (int) symbol;
            sum = sum + asciiCode;

        }
        System.out.println("The sum equals: " + sum);
    }
}
