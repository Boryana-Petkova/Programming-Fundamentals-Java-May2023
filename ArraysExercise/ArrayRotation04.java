package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays // може и само в String масив
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int rotations = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= rotations; i++) {
            int firstNum = numbers[0]; //оказвам първия елемент
            for (int index = 0; index < numbers.length - 1 ; index++) {
                numbers[index] = numbers[index + 1];//премествам наляво с един елемент
            }
            numbers[numbers.length - 1] = firstNum;//на последния елемент
            // поставям първия елемент след първата ротация, за да запълня
            // последната празна кутийка с първото число и пак се качвам за ротация,
            // горе ще се запази пак новото първо число и после ще го прибавя отзад
        }
        for (int num: numbers) {
            System.out.print(num + " ");
        }
    }
}
