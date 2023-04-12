package DataTypesAndVariablesLab;

import java.util.Scanner;

public class RefactorSpecialNumbers12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= num; i++) {
            int sum = 0;
            int actual = i;
            while (actual > 0) {
                sum += actual % 10;
                actual = actual / 10;
            }
            boolean trueFalse = (sum == 5) || (sum == 7) || (sum == 11);
            String tF;
            if (trueFalse) {
                tF = "True";
            } else {
                tF = "False";
            }
            System.out.printf("%d -> %s%n", i, tF);

        }
    }
}


