package Lists;

import java.util.*;

public class ListOfProducts06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());

        List<String> productList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String product = scanner.nextLine();
            productList.add(product);

        }
        Collections.sort(productList);// сортираме по азбучен ред

        for (int i = 0; i < productList.size(); i++) {
            System.out.println(i + 1 + "." + productList.get(i));
        }
    }
}
