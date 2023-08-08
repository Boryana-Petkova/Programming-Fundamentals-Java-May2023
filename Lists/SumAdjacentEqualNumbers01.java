package Lists;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjacentEqualNumbers01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     List<Double> numbersList = Arrays.stream(scanner.nextLine().split(" "))
             .map(Double::parseDouble)
             .collect(Collectors.toList());
        for (int i = 0; i <= numbersList.size() - 2; i++) {
    // слагаме -2 след size, а преди size <=, или -1 и преди size <, защато долу при nextNum, взимайки елемент...
            // на позиция 1 + 1 става 2 и гърми!!!
            double currentNum = numbersList.get(i);
            double nextNum = numbersList.get(i + 1);
            if (currentNum == nextNum){
                numbersList.set(i, currentNum + nextNum);
                //на позиция i сложи сумата от двете числа
                numbersList.remove(i + 1);
                //премахни числото от тази позиция
                i = -1;
                //върни i да проверява пак от 0 позиция
            }
        }
        System.out.println(joinElementsByDelimiter(numbersList, " "));
    }
    public static String joinElementsByDelimiter (List<Double> list, String delimiter){
        //правим Стринг, защото за принт тип join не можем да принтираме double
        DecimalFormat df = new DecimalFormat("0.#");
        String result = "";
        for (double item: list) {
        String numDf = df.format(item) + delimiter;
        result += numDf;
        }
        return result;
    }
}
