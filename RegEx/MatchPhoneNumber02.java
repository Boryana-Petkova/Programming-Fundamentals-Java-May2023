package RegEx;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchPhoneNumber02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        //+359 2 222 2222
        //+359-2-222-2222
        String regex = "\\+359([ -])2\\1\\d{3}\\1\\d{4}\\b"; // с \1 казваме да повтаря навсякъде
                                                        // интервал или тире между цифрите,
                                                // като сме сложили и извити скоби на интервала и тирето
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        List<String> validPhones = new ArrayList<>();

        while (matcher.find()){
            validPhones.add(matcher.group()); // слагаме в лист валидните телефони
        }
        System.out.println(String.join(", ", validPhones));
        //принтираме, като на последния няма запетая
    }
}
