package OrderbyAge06;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Age> personList = new ArrayList<>();
        while (!input.equals("End")){
            String [] data = input.split("\\s+");
            String nameData = data[0];
            String IData = data[1];
            int ageData = Integer.parseInt(data[2]);
            Age person = new Age(nameData, IData, ageData);
            personList.add(person);

            input = scanner.nextLine();
        }
        Collections.sort(personList, Comparator.comparingInt(Age::getAge));
        for (Age person: personList ) {
            System.out.printf("%s with ID: %s is %d years old.%n", person.getName(), person.getID(), person.getAge());
        }
    }
}
