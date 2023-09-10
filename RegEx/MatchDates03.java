package RegEx;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchDates03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        //"dd{separator}MMM{separator}yyyy"
        String regex = "(?<day>\\d{2})(?<groupSepa>[\\-\\.\\/])(?<month>[A-Z][a-z]{2})\\2(?<year>\\d{4})";
        // пишем една главна буква без да оказваме с 1, няма нужда; сепараторите отделяме с наклонени черти
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()){
            String day = matcher.group("day"); // взимаме всяка група
            String month = matcher.group("month");
            String year = matcher.group("year");
            System.out.printf("Day: %s, Month: %s, Year: %s%n", day, month, year);
        }
        //Day: 13, Month: Jul, Year: 1928
        //Day: 10, Month: Nov, Year: 1934
        //Day: 25, Month: Dec, Year: 1937
    }
}
