package be.pxl.ja.knapsack;

import java.util.ArrayList;
import java.util.List;

public class Knapsack<I extends Item> {
    double maximumCapacity;
    List<I> items;

    public Knapsack(double maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
        this.items = new ArrayList<>();
    }
    public double getCurrentWeight() {
        double currentWeight=0;
        for(I item : items) {
            currentWeight += item.getWeight();
        }
        return currentWeight;
    }
    public void add(I item) throws KnapsackFullException {
        if(this.getCurrentWeight() + item.getWeight() > maximumCapacity) {
            throw new KnapsackFullException(
                    String.format("Cannot add attraction [%s]. Maximum capacity reached."
                            , item));
        }
        items.add(item);
    }
    public List<I> getItems() {
        return items;
    }
}
