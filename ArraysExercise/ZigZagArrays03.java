package ArraysExercise;

import java.util.Scanner;

public class ZigZagArrays03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        //4

            String[] firstArr = new String[n]; // [nul, nul, nul, nul] или колкото на брой е n
            String[] secondArr = new String[n]; // [nul, nul, nul, nul] или колкото на брой е n

        for (int i = 1; i <= n ; i++) { // или го правим от i = 0; i < n, за да не пишем после i - 1,
                    // тъй като в двата нови масива n показва бройката им, а тя започва от позиция 0 винаги.
                    //Ако i е 1 ще постави съответното число на позиция 1 в масивите
            String[] textArr = scanner.nextLine().split(" ");
            //1 5... редовете, които трябва да минат през итерация, първи, нечетен
            //9 10... втори ред, четен
            //31 81
            //41 20
            String firstElement = textArr[0];//след разделянето на два елемента със split, измъквам първия елемент от масива и го държа в променлива
            String secondElement = textArr[1];//измъквам елемента от масива и го държа в променлива

            if (i % 2 != 0){ //ако редът е нечетен... тоест първи ред String
                firstArr[i - 1] = firstElement;
                secondArr[i - 1] = secondElement;
            } else {
                secondArr[i - 1] = firstElement; //така поставяме първия елемент в съответния масив,
                // но оправяме позицията му и го поставяме на 0
                firstArr[i - 1] = secondElement;
            }
        }
        System.out.println(String.join(" ", firstArr));
        System.out.println(String.join(" ", secondArr));
    }
}
