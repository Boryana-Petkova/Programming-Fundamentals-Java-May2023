package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers1Arr = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> numbers2Arr = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        for (int i = 0; i <= numbers1Arr.size() - 1; i++) {
            int number1 = numbers1Arr.get(i);
            int number2 = numbers2Arr.get(i);
            if (number1 > number2){
                numbers1Arr.add(number1);
                numbers1Arr.add(numbers1Arr.size()-1, number2);
                numbers1Arr.remove(i);
                numbers2Arr.remove(i);
                i = -1;
            } else if (number1 == number2){
                numbers1Arr.remove(i);
                numbers2Arr.remove(i);
                i = -1;
            } else if (number2 > number1) {
                numbers2Arr.add(number2);
                numbers2Arr.add(numbers2Arr.size() - 1, number1);
                numbers2Arr.remove(i);
                numbers1Arr.remove(i);
                i = -1;
            }
            if (numbers1Arr.size() == 0) {
                System.out.printf("Second player wins! Sum: %d", numbersSum(numbers2Arr));
                break;
            } else if (numbers2Arr.size() == 0) {
                System.out.printf("First player wins! Sum: %d", numbersSum(numbers1Arr));
                break;
            }
        }
    }
    private static int numbersSum(List<Integer> listCards) {
        int sum = 0;
        for (int item : listCards) {
            sum += item;
        }
        return sum;
    }
}
