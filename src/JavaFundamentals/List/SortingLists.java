package JavaFundamentals.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortingLists {
    public static void main(String[] args) {
        // Write your code here
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        // Create new ArrrayList in products
        List<String> products = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String product = scanner.nextLine();
            products.add(product);
        }

        // Sorting the collections
        Collections.sort(products);

        for (int i = 0; i < products.size(); i++){
            System.out.printf("%d.%s%n", i + 1, products.get(i));
        }
    }
}
