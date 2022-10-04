package be.pxl.ja.robbery;

import java.util.ArrayList;
import java.util.List;

public class Knapsack {

    double maximumCapacity;
    List<Product> items;

    public Knapsack(double maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
        this.items = new ArrayList<>();
    }

    public double getCurrentWeight() {
        double currentWeight=0;
        for(Product product : items) {
            currentWeight += product.getWeight();
        }
        return currentWeight;
    }

    public void add(Product item) throws KnapsackFullException {
        if(this.getCurrentWeight() + item.getWeight() > maximumCapacity) {
            throw new KnapsackFullException(String.format("Cannot add Product [%s]. Maximum capacity reached.", item.getName()));
        }
        items.add(item);
    }

    public List<Product> getItems() {
        return items;
    }
}
