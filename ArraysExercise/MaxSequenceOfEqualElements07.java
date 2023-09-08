package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int maxLength = 0;
        int length = 1; // започваме от 1, защото първия индекс няма с какво да го сравняме отляво му
        // и съответно да броим дължината, ако се окаже, че първия индекс трябва да се преброи,
        // когато сравняваме втория индекс с този отляво на него

        int startIndex = 0;
        int newStart = 0;

        for (int i = 1; i < numbers.length; i++) {
            if(numbers[i] == numbers[i - 1]) {
                length++;
            } else { // ако числото на index i не е равно на числото му от ляво (1 != 0)
                length = 1;
                startIndex = i; //броим от index 1 в случая,
                // защото на index 0 имаме 0,която не е равна на 1, а след index 1 може
                // следващия index да е 1 и то е
                // равно на предния index и така броим дължината на повтарящите се числа
            }

            if(length > maxLength) { // следим ако следващи поредни числа
                // са повече от друга поредица преди нея, да сменим
                // newStart и да му зададем новия индекс. Ако пак са две поредни,
                // то length няма да е по-голяма от последната maxlength и така запазваме
                // най-лявата поредица в масива, отчетена малко по-горе
                maxLength = length;
                newStart = startIndex;
            }
        }

        for (int i = newStart; i < newStart + maxLength; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
