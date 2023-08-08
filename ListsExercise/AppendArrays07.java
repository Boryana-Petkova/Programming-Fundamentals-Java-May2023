package ListsExercise;

import java.util.*;
import java.util.stream.Collectors;

public class AppendArrays07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> numbersArr = Arrays.stream(scanner.nextLine()
                .split("\\|"))
                .collect(Collectors.toList());
        Collections.reverse(numbersArr);

            System.out.println(numbersArr.toString() //"[  7  8, 4 5 6 , 1 2 3 ]"
                    .replace("[", "") //"  7  8, 4 5 6 , 1 2 3 ]"
                    .replace("]", "") //"  7  8, 4 5 6 , 1 2 3 "
                    .trim()  //"7  8, 4 5 6 , 1 2 3" //премахва интервалите в началото и в края на кавичките
                    .replaceAll(",", "") //"7  8 4 5 6  1 2 3"
                    .replaceAll("\\s+", " ")); //"7 8 4 5 6 1 2 3"
    }
}
