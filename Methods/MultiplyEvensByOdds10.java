package Methods;

import java.util.Arrays;
import java.util.Scanner;

public class MultiplyEvensByOdds10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Math.abs(Integer.parseInt(scanner.nextLine()));// abc слагаме,
        // защото имаме входящо и отрицателно число

        System.out.println(multiply(num));
    }

    public static int multiply(int num){
        return evenSum(num) * oddSum(num);
    }
    public static int evenSum(int num){
        String inToString = Integer.toString(num);// int превръщаме в string,
        // за да го превърнем в масив от int

        int[] arr = Arrays
                .stream(inToString.split(""))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0){
                sum += arr[i];
            }
        }
        return sum;
    }
    public static int oddSum(int num) {
        String inToString = Integer.toString(num);

        int[] arr = Arrays
                .stream(inToString.split(""))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                sum += arr[i];
            }
        }
        return sum;
    }
}
