package RegEx;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchFullName01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String regex = "\\b[A-Z][a-z]+ [A-Z][a-z]+\\b"; // текст на шаблон;
                                                // java слага по още една наклонена черта
        Pattern pattern = Pattern.compile(regex); // правим реалния шаблон
        Matcher matcher = pattern.matcher(text); // взима от текста частите,
                                                // които отговарят на шаблона
        while (matcher.find()){ //връща true ако е намерил текстове
            System.out.print(matcher.group()+ " "); // принтира текст и после го изтрива от матчъра
        }
    }
}
