package ExerciseBasicSyntaxConditionalStatementsLoops;

import java.util.Scanner;

public class StrongNumber06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int startNumber = number;
        int sumFact = 0; // сума от факториелите
        while (number > 0){
            int lastDigit = number % 10; // намираме последната цифра
            //намираме факториела
            int fact = 1;
            for (int i = 1; i <= lastDigit ; i++) {
                fact = fact * i;
            }
            //сумирам факториела
            sumFact += fact;

            number = number / 10; //премахвам последната цифра
        }
        if (sumFact == startNumber) {
            System.out.println("yes");
        }else {
                System.out.println("no");
            }

    }
}
