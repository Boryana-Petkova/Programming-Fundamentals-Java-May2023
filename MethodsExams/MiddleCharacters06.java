package MethodsExams;

import java.util.Scanner;

public class MiddleCharacters06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        printMiddle(text);

    }
    public static void printMiddle(String text){
        if (text.length() % 2 != 0){
            int indexMiddle = text.length() / 2;
            System.out.print(text.charAt(indexMiddle));
        } else {
            int indexFirstMiddle = text.length() / 2 - 1;
            int indexSecondMiddle = text.length() / 2;
            System.out.print(text.charAt(indexFirstMiddle));
            System.out.print(text.charAt(indexSecondMiddle));
        }

    }
}
