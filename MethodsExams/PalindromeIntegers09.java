package MethodsExams;

import java.util.Scanner;

public class PalindromeIntegers09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        while (!command.equals("END")){
            if (isPalindrome(command)){
                System.out.println("true");
            } else {
                System.out.println("false");
            }
            command = scanner.nextLine();
        }
    }
    public static boolean isPalindrome(String text){
        String reverseText = "";
        for (int i = text.length() - 1; i >= 0 ; i--) {
            reverseText += text.charAt(i);
        }
        return text.equals(reverseText);
    }
}
