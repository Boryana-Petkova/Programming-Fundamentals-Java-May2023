package MethodsExams;

import java.util.Scanner;

public class TopNumber10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= number ; i++) {
            if (findTopDigits(i) && isOddDigit(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean findTopDigits(int number){
        int sumDigits = 0;
        while (number > 0){
            int lastDigit = number % 10;
            //взимаме последната цифра
            sumDigits += lastDigit;
            //сумираме последната цифра
            number = number / 10;
            //премахване последната цифра
        }
//        if (sumDigits % 8 == 0){
//            return true;
//        } else {
//            return false;
//        }
        return sumDigits % 8 == 0;
    }
    public static boolean isOddDigit(int number){
        while (number > 0){
            int lastDigit = number % 10;
            if (lastDigit % 2 != 0){
                return true;
                // спираме целия цикъл, имаме една нечетна цифра
            } else {
                number = number / 10;
                //продължаваме да търсим нечетна цифра в числото
            }
        }
        return false;
        // ако не намерим нечетна цифра в числото
    }
}
