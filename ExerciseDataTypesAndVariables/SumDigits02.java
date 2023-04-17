package ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class SumDigits02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        int startNumber = number;

        int sumDigits = 0; // сума от цифрите

        while (number > 0) {
            int lastDigit = number % 10; // намираме последната цифра
            sumDigits += lastDigit; //сумирам цифрата
            number = number / 10; //премахвам последната цифра
            }
            System.out.println(sumDigits);
    }
}
