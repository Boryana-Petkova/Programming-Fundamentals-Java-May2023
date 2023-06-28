package MethodsExams;

import java.util.Scanner;

public class PasswordValidator04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        boolean isValidNeededCharacters = isValidNeededCharacters(password);
        if (!isValidNeededCharacters){
            System.out.println("Password must be between 6 and 10 characters");
        }
        boolean isValidConsistLettersAndDigits = isValidConsistLettersAndDigits(password);
        if (!isValidConsistLettersAndDigits){
            System.out.println("Password must consist only of letters and digits");
        }
        boolean isValidHave2Digits = isValidHave2Digits(password);
        if (!isValidHave2Digits){
            System.out.println("Password must have at least 2 digits");
        }
        if (isValidNeededCharacters(password) && isValidConsistLettersAndDigits(password) && isValidHave2Digits(password)){
            System.out.println("Password is valid");

        }
    }
    public static boolean isValidNeededCharacters(String password){
            return  password.length() >=6 && password.length() <=10;
    }
    public static boolean isValidConsistLettersAndDigits(String password){
        for (char symbol: password.toCharArray()) {
            if (!Character.isLetterOrDigit(symbol)){
                return false;
            }
        }
        return true;
        }
        public static boolean isValidHave2Digits(String password){
        int countDigits = 0;
            for (char symbol : password.toCharArray()) {
                if (Character.isDigit(symbol)){
                    countDigits ++;
                }
            }
            return countDigits >= 2;
    }
}
