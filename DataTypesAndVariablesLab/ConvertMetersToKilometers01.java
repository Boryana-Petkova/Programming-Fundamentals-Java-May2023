package DataTypesAndVariablesLab;

import java.util.Scanner;

public class ConvertMetersToKilometers01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int meters = Integer.parseInt(scanner.nextLine());
        double kilometres = meters / 1000.0;
        System.out.printf("%.2f", kilometres);
    }
}
