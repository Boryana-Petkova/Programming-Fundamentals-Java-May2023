package ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class proba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        char first = (char) ('a' + n);
        System.out.println(first);
    }
}
