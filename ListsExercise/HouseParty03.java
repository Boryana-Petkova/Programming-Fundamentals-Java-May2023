package ListsExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class HouseParty03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<String> guestsArr = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String command = scanner.nextLine();
            String name = command.split("\\s+")[0];
            if (command.contains("is going!")){
                if (guestsArr.contains(name)){
                    System.out.println(name + " is already in the list!");
                } else {
                    guestsArr.add(name);
                }
            } else if (command.contains("is not going!")){
                if (guestsArr.contains(name)){
                    guestsArr.remove(name);
                } else {
                    System.out.println(name + " is not in the list!");
                }
            }
        }
        for (int i = 0; i <= guestsArr.size() -1; i++) {
            String guest = guestsArr.get(i);
            System.out.println(guest);
        }
    }
}
