package BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class RefactorSumOfOddNumbers12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 1; i <= n * 2; i++) {
            if (i % 2 == 1) {
                System.out.print(i);
                System.out.println();
                sum = sum + i;
            }
        }
            System.out.printf("Sum: %d%n", sum);
    }
}
