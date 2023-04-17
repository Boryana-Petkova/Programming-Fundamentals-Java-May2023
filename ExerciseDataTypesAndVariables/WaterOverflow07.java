package ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class WaterOverflow07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int capacity = 255;
        int sumLiters = 0;

        for (int i = 1; i <=n ; i++) {
            int currentLiters = Integer.parseInt(scanner.nextLine());
            sumLiters+= currentLiters;

            if (sumLiters > capacity) {
                sumLiters-= currentLiters;
                System.out.println("Insufficient capacity!");
            }
        }
            System.out.println(sumLiters);
    }
}
