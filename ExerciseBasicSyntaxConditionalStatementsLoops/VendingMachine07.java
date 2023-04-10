package ExerciseBasicSyntaxConditionalStatementsLoops;

import java.util.Scanner;

public class VendingMachine07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        double countCoins = 0.0;
        while (!command.equals("Start")){
            double coin = Double.parseDouble(command);
            if (coin == 0.1 || coin == 0.2 || coin == 0.5 || coin == 1 || coin == 2) {
                countCoins += coin;
            } else {
                System.out.printf("Cannot accept %.2f%n", coin);
            }
                command = scanner.nextLine();
            }
        String product = scanner.nextLine();

        while (!product.equals("End")){

            switch (product){
                case "Nuts":
                    if (countCoins >= 2){
                        System.out.printf("Purchased %s%n", product);
                        countCoins -= 2;
                    } else {
                        System.out.printf("Sorry, not enough money%n");
                    }
                    break;
                case "Water":
                    if (countCoins >= 0.7){
                        System.out.printf("Purchased %s%n", product);
                        countCoins -= 0.7;
                    } else {
                        System.out.printf("Sorry, not enough money%n");
                    }
                    break;
                case "Crisps":
                    if (countCoins >= 1.5){
                        System.out.printf("Purchased %s%n", product);
                        countCoins -= 1.5;
                    } else {
                        System.out.printf("Sorry, not enough money%n");
                    }
                    break;
                case "Soda":
                    if (countCoins >= 0.8){
                        System.out.printf("Purchased %s%n", product);
                        countCoins -= 0.8;
                    } else {
                        System.out.printf("Sorry, not enough money%n");
                    }
                    break;
                case "Coke":
                    if (countCoins >= 1.0){
                        System.out.printf("Purchased %s%n", product);
                        countCoins -= 1.0;
                    } else {
                        System.out.printf("Sorry, not enough money%n");
                    }
                    break;
                default:
                    System.out.printf("Invalid product%n");
                    break;
            }
            product = scanner.nextLine();
        }
        System.out.printf("Change: %.2f%n", countCoins);
    }
}
