package ObjectsAndClasses;

import java.math.BigInteger;
import java.util.Scanner;

public class BigFactorial03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        BigInteger result = new BigInteger(String.valueOf(1));
        // правим Стринг, за да приеме числото, не може инт
        for (int i = 1; i <= n ; i++) {
            result = result.multiply(BigInteger.valueOf(i));
            // тук същото
        }
        System.out.println(result);
    }
}
