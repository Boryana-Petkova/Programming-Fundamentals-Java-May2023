package ExerciseBasicSyntaxConditionalStatementsLoops;

import java.util.Scanner;

public class PadawanEquipment10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double lucasMoney = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double priceLight = Double.parseDouble(scanner.nextLine());
        double priceRobes = Double.parseDouble(scanner.nextLine());
        double priceBelts = Double.parseDouble(scanner.nextLine());

        double allLight = Math.ceil((students * 0.10) + students);
        double sumLight = priceLight * allLight;
        double allBelts = students - Math.floor(students *  1.0 / 6);
        double sumBelts = priceBelts * allBelts;
        double totalSum = sumLight + priceRobes * students + sumBelts;
        if (totalSum <= lucasMoney) {
            System.out.printf("The money is enough - it would cost %.2flv.", totalSum);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", totalSum - lucasMoney);
        }

    }
}
