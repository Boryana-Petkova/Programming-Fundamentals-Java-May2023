package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        String command = scanner.nextLine();
        while (!command.equals("end")) {
            if (command.contains("swap")){
        // contains защото командата swap идва с различни числа до нея
            int index1 = Integer.parseInt(command.split(" ")[1]);
            //взимаме елемент от командата, която съдържа име на команда...
                // и два елемента (индекси от горния масив)
                // и парсваме до число, на съответната позиция, в случая 1
            int index2 = Integer.parseInt(command.split(" ")[2]);
            int element1 = numbers[index1];
            int element2 = numbers[index2];
            numbers[index1] = element2;
            numbers[index2] = element1;
            }else if (command.contains("multiply")){
                int index1 = Integer.parseInt(command.split(" ")[1]);
                int index2 = Integer.parseInt(command.split(" ")[2]);
                int element1 = numbers[index1];
                int element2 = numbers[index2];

                int product = element1 * element2;
                numbers[index1] = product;
            } else if (command.equals("decrease")){
                //тук избираме дали е равно - equals
                for (int index = 0; index <= numbers.length - 1; index++) {
                    //обхождаме всички елементи в масива и ги намаляме с 1
                    numbers[index]--;
                    //вариант 2
                    //numbers[index] = numbers[index] - 1;
                    //вариант 3
                    //numbers[index]-= 1;
                }
            }
            command = scanner.nextLine();
        }
        for (int index = 0; index <= numbers.length - 1 ; index++) {
            int currentNumber = numbers[index];
            if (index != numbers.length - 1){
                System.out.print(currentNumber + ", ");
            } else {
                System.out.print(currentNumber);
                //ако е последното число, отпечатай го
                // без запетая и интервал
            }
        }
    }
}
