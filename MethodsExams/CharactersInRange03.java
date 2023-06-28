package MethodsExams;

import java.util.Scanner;

public class CharactersInRange03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char symbol1 = scanner.nextLine().charAt(0);
        char symbol2 = scanner.nextLine().charAt(0);
        printCharRange(symbol1,symbol2);
    }
    public static void printCharRange(char s1, char s2){
        if (s1 < s2){
        for (char i = (char)(s1 + 1); i < s2 ; i++) {
            System.out.print(i + " ");
        }
    } else if (s1 >= s2){
            for (char i = (char)(s2 + 1); i < s1; i++) {
                System.out.print(i + " ");
            }
        }
    }
}
