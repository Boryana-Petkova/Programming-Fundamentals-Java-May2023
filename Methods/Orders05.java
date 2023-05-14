package Methods;

import java.util.Scanner;

public class Orders05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String productInput = scanner.nextLine();
        int quantityInput = Integer.parseInt(scanner.nextLine());

        switch (productInput){
            case "coffee":
                printCoffeeSum(quantityInput);
                break;
            case "water":
                waterSum(quantityInput);
                break;
            case "coke":
                printCokeSum(quantityInput);
                break;
            case "snacks":
                printSnacksSum(quantityInput);
                break;
        }
    }
    public static void printCoffeeSum(int quantity){
        double result = quantity * 1.50;
        System.out.printf("%.2f", result);
    }
    public static void waterSum(int quantity) {
        double result = quantity * 1.00;
        System.out.printf("%.2f", result);
    }
    public static void printCokeSum(int quantity) {
        double result = quantity * 1.40;
        System.out.printf("%.2f", result);
    }
    public static void printSnacksSum(int quantity) {
        double result = quantity * 2.00;
        System.out.printf("%.2f", result);
    }
}
