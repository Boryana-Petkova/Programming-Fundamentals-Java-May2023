package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = Arrays// 3 числа (2 10 3)
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] condensed = new int[nums.length - 1];
        // 2 числа, създадени от трите горе, чрез обхождане през for цикъл
        //нов масив от дължината на прочетения
        for (int i = 0; i < nums.length; i++) {
            //обхождаме
            if (nums.length == 1){
            // ако е един елемент/число, прекъсни
                break;
            }
            if (i == nums.length - 1){ //ако е последно число???
                int[] condensedNew = new int[condensed.length - 1];
            //нов масив, за да не се връщаме към поредна итерация горе
                i = -1;
                nums = condensed;
                condensed = condensedNew;
            } else {
                condensed[i] = nums[i] + nums[i + 1];
            }
        }
        System.out.println(nums[0]);
    }
}
