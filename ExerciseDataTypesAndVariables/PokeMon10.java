package ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class PokeMon10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());

        int countTargets = 0;
        int startN = n;

        while (n >= m){
            n -= m;
            countTargets ++;

            if (n == startN / 2){
                if (y != 0){
                    n = n / y;
                }
            }
        }
        System.out.println(n);
        System.out.println(countTargets);
    }
}
