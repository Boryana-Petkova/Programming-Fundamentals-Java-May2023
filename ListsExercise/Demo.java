package ListsExercise;

import java.util.*;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> elementsArr = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.equals("3:1")){

            if (command.contains("merge")){
                int startIndex = Integer.parseInt(command.split(" ")[1]);
                int endIndex = Integer.parseInt(command.split(" ")[2]);
                if (startIndex < 0){
                    startIndex = 0;
                }
                if (endIndex > elementsArr.size()-1){
                    endIndex = elementsArr.size()-1;
                }
                if (startIndex >= 0 && endIndex <= elementsArr.size()-1){
                    //String result = "";
                    StringBuilder result = new StringBuilder(); //Билдъра е по-бърз от += ,
                    // когато искаме да долепяме елементи
                    for (int i = startIndex; i <= endIndex; i++) {
                        String current = elementsArr.get(i);
                        //result += current;
                        result.append(elementsArr.get(i));
                        //elementsArr.set(startIndex, result);
                        elementsArr.set(startIndex, result.toString()); //билдъра обаче не е стринг,
                        // затова му казваме toString
                    }
                }

            } else if (command.contains("divide")){
                int indexDivide = Integer.parseInt(command.split(" ")[1]);
                int partition = Integer.parseInt(command.split(" ")[2]);

                    String currentIndex = elementsArr.get(indexDivide);
                    elementsArr.remove(indexDivide);
                    int count = currentIndex.length() / partition;
                for (int part = 1; part <= partition ; part++) {

                }
            }



            command = scanner.nextLine();
        }

    }
}
