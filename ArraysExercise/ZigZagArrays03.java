package ArraysExercise;

import java.util.Scanner;

public class ZigZagArrays03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fourElements = Integer.parseInt(scanner.nextLine());

            String[] firstArr = new String[fourElements];
            String[] secondArr = new String[fourElements];

        for (int lineAndIndex = 1; lineAndIndex <= fourElements ; lineAndIndex++) { 
            String[] elements = scanner.nextLine().split(" ");
            String firstElement = elements[0];
            String secondElement = elements[1];

            if (lineAndIndex % 2 == 0){ 
                secondArr[lineAndIndex - 1] = firstElement; 
                
                firstArr[lineAndIndex - 1] = secondElement;
            } else {
                firstArr[lineAndIndex - 1] = firstElement;
                secondArr[lineAndIndex - 1] = secondElement;
            }
        }
        System.out.println(String.join(" ", firstArr));
        System.out.println(String.join(" ", secondArr));
    }
}
