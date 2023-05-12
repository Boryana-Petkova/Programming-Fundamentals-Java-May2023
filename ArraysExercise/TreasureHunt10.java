package ArraysExercise;

import java.util.Scanner;

public class TreasureHunt10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] loots = scanner.nextLine().split("\\|");
        

        String command = scanner.nextLine();
        while (!command.equals("Yohoho!")){
            String[] commandParts = command.split(" ");
            
            String commandName = commandParts[0];
            switch (commandName){
                case "Loot":
                    break;
                case "Drop":
             int dropIndex = Integer.parseInt(commandParts[1]);
             if (dropIndex < 0 || dropIndex >= loots.length - 1){
                 break;
             } else {
                 String currentLoot = loots[dropIndex];
                 
                 for (int leftMyIndex = dropIndex; leftMyIndex < loots.length - 1 ; leftMyIndex++) {
                     loots[leftMyIndex] = loots[leftMyIndex + 1];
                     loots[loots.length - 1] = currentLoot; 

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
