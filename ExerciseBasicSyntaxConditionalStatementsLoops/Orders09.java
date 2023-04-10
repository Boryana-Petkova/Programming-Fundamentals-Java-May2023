package ExerciseBasicSyntaxConditionalStatementsLoops;

import java.util.Scanner;

public class Orders09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double count = 0;
        double total = 0;
        for (int i = 1; i <= n ; i++) {

            double priceCapsule = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsuleCount = Integer.parseInt(scanner.nextLine());

            double orderPrice = days * capsuleCount * priceCapsule;
            System.out.printf("The price for the coffee is: $%.2f%n", orderPrice);
            count += orderPrice;
        }
            total += count;
            System.out.printf("Total: $%.2f", total);

    }
}
