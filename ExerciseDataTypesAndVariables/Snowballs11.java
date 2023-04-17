package ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class Snowballs11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double max = Double.MIN_VALUE;
        int snowballSnowBiggest = 0;
        int snowballTTimeBiggest = 0;
        int snowballQualityBiggest = 0;

        for (int i = 1; i <= n ; i++) {
            int balls = Integer.parseInt(scanner.nextLine());
            int time = Integer.parseInt(scanner.nextLine());
            int quality = Integer.parseInt(scanner.nextLine());
            double value = Math.pow(balls / time, quality);

            if (value > max){
                max = value;
                snowballSnowBiggest = balls;
                snowballTTimeBiggest = time;
                snowballQualityBiggest = quality;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)", snowballSnowBiggest,
                snowballTTimeBiggest, max, snowballQualityBiggest);
    }
}
