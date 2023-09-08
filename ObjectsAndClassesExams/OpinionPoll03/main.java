package OpinionPoll03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Person> peopleList = new ArrayList<>();
        //създаваме лист с обект Person, в който ще прибавяме хората над 30
        for (int i = 1; i <= n ; i++) {
            String data = scanner.nextLine();
            String name = data.split(" ")[0];
            int age = Integer.parseInt(data.split(" ")[1]);
            if (age > 30){
                Person person = new Person(name, age);
                //това е като променлива, има тип, име и след равно подаваме стойностите,
                // като указваме, че ползваме конструктора Person, за да ги въведем
                peopleList.add(person);
                //прибавяме всеки създаден човек в Листа,
                // който обаче приема само обекти от един клас
            }
        }
        for (Person person:peopleList) {
            System.out.println(person.getName() + " - " + person.getAge());
        }
    }
}
