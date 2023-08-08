package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int sizeList = numList.size();
        for (int i = 0; i < sizeList / 2; i++) { //слагаме началния лист дължина,
            // иначе при итерациите се променя и размера на листа,
            //  тоест намалява, а цикълът знае,
            // че трябва да направи итерации / 2,
            // да върти и да сумира числа
            int firstNum = numList.get(i);
            int lastNum = numList.get(numList.size() - 1);

            numList.set(i, firstNum + lastNum);
            numList.remove(numList.size() - 1);
        }
        for (int item : numList) {
            System.out.print(item + " ");
        }
    }
}
