package be.pxl.ja.robbery;

import java.util.Collections;
import java.util.List;

public class KnapsackUtil {

    public static void fill(Knapsack knapsack, Shop shop) {
        List<Product> items = shop.getItems();

        Collections.sort(items);

        for(Product product : items) {
            try {
                knapsack.add(product);
            } catch (KnapsackFullException e) {
                System.out.println(e.getMessage());
                break;
            }
        }

    }

}
