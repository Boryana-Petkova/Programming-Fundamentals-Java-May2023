package ExerciseBasicSyntaxConditionalStatementsLoops;

import java.util.Scanner;

public class Vacation03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countPeople = Integer.parseInt(scanner.nextLine());
        String typeGroup = scanner.nextLine();
        String day = scanner.nextLine();
        double price = 0;

        if (typeGroup.equals("Students")){
            if (day.equals("Friday")){
                price = 8.45;
            } else if (day.equals("Saturday")) {
                price = 9.80;
            } else if (day.equals("Sunday")) {
                price = 10.46;
            }
        } else if (typeGroup.equals("Business")) {
            if (day.equals("Friday")) {
                price = 10.90;
            } else if (day.equals("Saturday")) {
                price = 15.60;
            } else if (day.equals("Sunday")) {
                price = 16;
            }
        } else if (typeGroup.equals("Regular")) {
            if (day.equals("Friday")) {
                price = 15;
            } else if (day.equals("Saturday")) {
                price = 20;
            } else if (day.equals("Sunday")) {
                price = 22.50;
            }
        }
        double sum = price * countPeople;
        if (typeGroup.equals("Students")){
            if (countPeople >= 30){
                sum = sum - sum * 0.15;
            }
        }
        if (typeGroup.equals("Business")) {
            if (countPeople >= 100) {
                sum = price * (countPeople - 10);
            }
        }
        if (typeGroup.equals("Regular")) {
            if (countPeople >= 10 & countPeople <= 20) {
                sum = sum - sum * 0.05;
            }
        }
        System.out.printf("Total price: %.2f", sum);
    }
}
