package Methods;

import java.util.Scanner;

public class SignOfInteger01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numInput = Integer.parseInt(scanner.nextLine());

        printNumbersSigh(numInput);

    }
    public static void printNumbersSigh (int num){
        if (num < 0){
            System.out.printf("The number %d is negative.", num);
        }else if (num > 0){
            System.out.printf("The number %d is positive.", num);
        } else {
            System.out.printf("The number %d is zero.", num);
        }
    }
}
