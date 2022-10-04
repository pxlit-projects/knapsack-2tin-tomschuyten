package be.pxl.ja.citytrip;

import java.util.ArrayList;
import java.util.List;

public class Knapsack {

    double maximumCapacity;
    List<Attraction> items;

    public Knapsack(double maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
        this.items = new ArrayList<>();
    }

    public double getCurrentWeight() {
        double currentWeight=0;
        for(Attraction attraction : items) {
            currentWeight += attraction.getWeight();
        }
        return currentWeight;
    }

    public void add(Attraction item) throws KnapsackFullException {
        if(this.getCurrentWeight() + item.getWeight() > maximumCapacity) {
            throw new KnapsackFullException(String.format("Cannot add attraction [%s]. Maximum capacity reached.", item.getName()));
        }
        items.add(item);
    }

    public List<Attraction> getItems() {
        return items;
    }
}
