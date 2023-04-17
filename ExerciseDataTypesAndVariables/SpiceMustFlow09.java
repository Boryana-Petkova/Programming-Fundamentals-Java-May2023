package ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class SpiceMustFlow09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int yield = Integer.parseInt(scanner.nextLine());

        int workersConsume = 26;
        int totalAmount = 0;
        int days = 0;

        while (yield >= 100){
            int dayYield = yield - workersConsume;//добив
            days ++;
            yield = yield - 10;
            totalAmount += dayYield;
        }
        System.out.println(days);
        if (totalAmount >= 26){
            totalAmount -= 26;
        }
        System.out.println(totalAmount);
    }
}
