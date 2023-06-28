package MethodsExams;

import java.util.Scanner;

public class VowelsCount02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        printVowelsCount(text.toLowerCase());
        //казваме на текста първо да стане с малки букви, преди да влезе в метода
    }
    public static void printVowelsCount(String text){
        int count = 0;
        for (char symbols: text.toCharArray()) {
            //така достъпваме в масива до всеки символ, защото използваме foreach
            if (symbols == 'a' || symbols == 'e' || symbols == 'i' || symbols == 'u' || symbols == 'o'){
                count++;
            }
        }
        System.out.println(count);
    }
}
