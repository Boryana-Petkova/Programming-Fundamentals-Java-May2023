package Methods;

import java.util.Scanner;

public class CalculateRectangleArea06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int widthInput = Integer.parseInt(scanner.nextLine());
        int heightInput = Integer.parseInt(scanner.nextLine());

        int result = calculateArea(widthInput, heightInput);

        System.out.println(result);

    }
    public static int calculateArea (int width, int height){
        return width * height;
    }
}
