package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PokemonDontGo09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersArr = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int sumRemoved = 0;
        while (numbersArr.size() > 0){
            int index = Integer.parseInt(scanner.nextLine());
            if (index >= 0 && index <= numbersArr.size() - 1){
                int removeElement = numbersArr.get(index);
                sumRemoved += removeElement;
                numbersArr.remove(index);
                modifiedList(numbersArr, removeElement);
            } else if (index < 0){
                int firstNumber = numbersArr.get(0);
                sumRemoved += firstNumber;
                numbersArr.remove(0);
                int lastNumber = numbersArr.get(numbersArr.size()- 1);
                numbersArr.add(0, lastNumber);
                modifiedList(numbersArr, firstNumber);

            }
            else if (index > numbersArr.size() - 1){
                    int lastNumber = numbersArr.get(numbersArr.size() - 1);
                    sumRemoved += lastNumber;
                    numbersArr.remove(numbersArr.size() -1);
                    int firstNumber = numbersArr.get(0);
                    numbersArr.add(firstNumber);
                modifiedList(numbersArr, lastNumber);
            }
        }
        System.out.println(sumRemoved);
    }
    private static void modifiedList(List<Integer> numbersArr, int firstNumber) {
        for (int indexinList = 0; indexinList <= numbersArr.size() - 1; indexinList++) {
            int currentNumber = numbersArr.get(indexinList);
            if (currentNumber <= firstNumber){
                currentNumber += firstNumber;
            } else if (currentNumber > firstNumber){
                currentNumber -= firstNumber;
            }
            numbersArr.set(indexinList, currentNumber);
        }
    }
}
