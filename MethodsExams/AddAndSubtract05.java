package MethodsExams;

import java.util.Scanner;

public class AddAndSubtract05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        int sum = sumNumbers(num1, num2);
        int result = subtractNumber(sum, num3);
        System.out.println(result);
    }

    public static int sumNumbers(int n1, int n2) {
        return n1 + n2;
    }
    public static int subtractNumber (int n1, int n2){
        return n1 - n2;
    }
}
