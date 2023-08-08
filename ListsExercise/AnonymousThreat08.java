package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnonymousThreat08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> textsArr = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());
        String command = scanner.nextLine();
        while (!command.equals("3:1")){
            if (command.contains("merge")){
                int startIndex = Integer.parseInt(command.split(" ")[1]);
                int endIndex = Integer.parseInt(command.split(" ")[2]);

                if (startIndex < 0){
                    startIndex = 0;
                }
                if (endIndex > textsArr.size() -1){
                    endIndex = textsArr.size() -1;
                    //•	The startIndex and the endIndex will be in the range [-1000, 1000].
                }
                if (startIndex >= 0 && startIndex <= textsArr.size()-1 && endIndex >= 0 && endIndex <= textsArr.size()-1){
                    String resultMerge = "";
                    for (int index = startIndex; index <= endIndex ; index++) {
                        String current = textsArr.get(index);
                        resultMerge += current;
                    }
                    for (int index = startIndex; index <= endIndex ; index++) {
                        textsArr.remove(startIndex);
                    }
                        textsArr.add(startIndex, resultMerge);
                }
            } else if (command.contains("divide")){
                int indexCommand = Integer.parseInt(command.split(" ")[1]);
                int partsCommand = Integer.parseInt(command.split(" ")[2]);
                //"abcdef", "ghi", "jkl"
                //divide 0 3
                if (indexCommand >= 0 && indexCommand <= textsArr.size()-1){
                    String textDivide = textsArr.get(indexCommand);
                    textsArr.remove(indexCommand);
                    //"ghi", "jkl"

                    //1. колко символа ще има всяка част
                    int count = textDivide.length() / partsCommand;

                    //всички равни части без последната
                    int beginIndex = 0; //index в текста за деление
                    for (int i = 1; i < partsCommand; i++) {
                        String textPart = textDivide.substring(beginIndex, beginIndex + count);
                        textsArr.add(indexCommand, textPart);
                        indexCommand++; //място на поставяне на разбитата част в главния списък
                        beginIndex += count;
                    }
                    //последната част
                    String textLastParts = textDivide.substring(beginIndex, textDivide.length());
                    textsArr.add(indexCommand, textLastParts);
                }
            }

            command = scanner.nextLine();
        }
        //!!!!отпчетваме списък с тесктовете -> String.join!!!
        System.out.println(String.join(" ", textsArr));

        /*for (String text : texts) {
            System.out.print(text + " ");
        }*/
    }
    //abcd efgh ijkl mnop qr st uv wx yz
}
