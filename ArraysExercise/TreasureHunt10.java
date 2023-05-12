package ArraysExercise;

import java.util.Scanner;

public class TreasureHunt10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] loots = scanner.nextLine().split("\\|");
        //ескейпване - оказвам, че това е символ, а не оператор от ||

        String command = scanner.nextLine();
        while (!command.equals("Yohoho!")){
            String[] commandParts = command.split(" ");
            //Loot {item1} {item2}…{itemn} - командата ми, и искам да достигна до първия й елемент,
            //затова първо ги раздробявам
            String commandName = commandParts[0];// взимам я и я правя на променлива
            switch (commandName){
                case "Loot":
                    break;
                case "Drop":
             int dropIndex = Integer.parseInt(commandParts[1]);
             if (dropIndex < 0 || dropIndex >= loots.length - 1){
                 //проверяваме дали е невалиден индекс, тоест не е 0 1 2 3 и т.н.
                 // или по-голям от зададения последен индекс в inputa
                 break;
             } else {
                 String currentLoot = loots[dropIndex];
                 // при валиден индекс
                 for (int leftMyIndex = dropIndex; leftMyIndex < loots.length - 1 ; leftMyIndex++) {
                     loots[leftMyIndex] = loots[leftMyIndex + 1];
                     loots[loots.length - 1] = currentLoot; // слагаме на последния индекс

                 }
             }
                    break;
                case "Steal":
                    break;
            }



            command = scanner.nextLine();
        }
    }
}
