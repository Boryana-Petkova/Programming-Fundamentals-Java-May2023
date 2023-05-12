package ArraysExercise;

import java.util.Scanner;

public class ZigZagArrays03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fourElements = Integer.parseInt(scanner.nextLine());

            String[] firstArr = new String[fourElements];
            String[] secondArr = new String[fourElements];

        for (int lineAndIndex = 1; lineAndIndex <= fourElements ; lineAndIndex++) { // или го правим от 0, за да не пишем после lineAndIndex - 1
            String[] elements = scanner.nextLine().split(" ");
            String firstElement = elements[0];//след разделянето на два елемента със split, измъквам първия елемент от масива и го държа в променлива
            String secondElement = elements[1];//измъквам елемента от масива и го държа в променлива

            if (lineAndIndex % 2 == 0){ //ако редът е четен...
                secondArr[lineAndIndex - 1] = firstElement; //така поставяме първия елемент в съответния масив,
                // но оправяме позицията му и го поставяме на 0
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
