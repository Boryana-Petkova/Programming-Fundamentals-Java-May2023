package MethodsExams;

import java.util.Scanner;

public class NxNMatrix07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        printMatrix(num);
    }
    private static void printMatrix(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
