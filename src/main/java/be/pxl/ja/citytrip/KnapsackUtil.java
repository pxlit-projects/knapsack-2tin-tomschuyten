package be.pxl.ja.citytrip;

import java.util.Collections;
import java.util.List;

public class KnapsackUtil {

    public static void fill(Knapsack knapsack, LondonAttractions londonAttractions) {
        List<Attraction> items = londonAttractions.getItems();

        Collections.sort(items);

        for(Attraction attraction : items) {
            try {
                knapsack.add(attraction);
            } catch (KnapsackFullException e) {
                System.out.println(e.getMessage());
                break;
            }
        }

    }

}
