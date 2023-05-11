package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class InfoArr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //2 8 30 25 40 72 -2 44 56
        //String values = scanner.nextLine();//прочитаме

//        String[] valuesArr = values.split(" ");//махаме интервалите
//
//        int[] numberArr = new int[valuesArr.length];
//        //превръщаме String в int, обхождайки всяко число
//        for (int i = 0; i < valuesArr.length ; i++) {
//            numberArr[i] = Integer.parseInt(valuesArr[i]);
//            System.out.printf("%d = %d%n", i, numberArr[i]);

        //Кратък вариант:

//        int[] arr = Arrays
//                .stream(scanner.nextLine().split(" "))
//                .mapToInt(e -> Integer.parseInt(e)).toArray();
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.printf("%d -> %d%n", i, arr[i]);
//                }
//
//            }
//        }

        String[] dayOfWeekArr = {
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"
        };
        System.out.println(String.join(", ", dayOfWeekArr));
    }
}