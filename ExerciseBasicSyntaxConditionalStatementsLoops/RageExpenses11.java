package ExerciseBasicSyntaxConditionalStatementsLoops;

import java.util.Scanner;

public class RageExpenses11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGamesCount = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int countHeadset = lostGamesCount / 2;
        int countMouse = lostGamesCount / 3;
        int countKeyboard = lostGamesCount / 6;
        int countDisplay = lostGamesCount / 12;

        double finalSum = (countHeadset * headsetPrice) + (countMouse * mousePrice)
                + (countKeyboard * keyboardPrice) + (countDisplay * displayPrice);
        System.out.printf("Rage expenses: %.2f lv.", finalSum);
    }
}
