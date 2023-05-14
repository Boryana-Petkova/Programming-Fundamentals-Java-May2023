package Methods;

import java.util.Scanner;

public class RepeatString07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameInput = scanner.nextLine();
        int countInput = Integer.parseInt(scanner.nextLine());
        String resultText = repeatString(nameInput, countInput);

        System.out.println(repeatString(nameInput, countInput));
    }
    public static String repeatString(String name, int count){
        String result = "";
        for (int i = 1; i <= count ; i++) {
            result = result + name;
        }
        return result;
    }
}
