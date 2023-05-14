package Methods;

import java.util.Scanner;

public class Calculations04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String commandInput = scanner.nextLine();
        int numInput1 = Integer.parseInt(scanner.nextLine());
        int numInput2 = Integer.parseInt(scanner.nextLine());

        switch (commandInput){
            case "add":
                printNumbersAdd(numInput1, numInput2);
                break;
            case "multiply":
                printNumbersMultiply(numInput1, numInput2);
                break;
            case "subtract":
                printNumbersSubstract(numInput1, numInput2);
                break;
            case "divide":
                printNumbersDivide(numInput1, numInput2);
                break;
        }
    }
    public static void printNumbersAdd (int num1, int num2){
        int result = num1 + num2;
        System.out.println(result);
    }
    public static void printNumbersMultiply (int num1, int num2) {
        int result = num1 * num2;
        System.out.println(result);
    }
    public static void printNumbersSubstract (int num1, int num2) {
        int result = num1 - num2;
        System.out.println(result);
    }
    public static void printNumbersDivide (int num1, int num2) {
        int result = num1 / num2;
        System.out.println(result);
    }
}
