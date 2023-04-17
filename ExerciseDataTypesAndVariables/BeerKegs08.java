package ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class BeerKegs08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double max = Integer.MIN_VALUE;
        String maxModel = "";
        for (int keg = 1; keg <= n ; keg++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());
            //π * r^2 * h.
            double volume = Math.PI * Math.pow(radius, 2) * height;
            if (volume > max) {
                max = volume;
                maxModel = model;
            }
        }
        System.out.println(maxModel);
    }
}
