package be.pxl.ja.knapsack;

public class Attraction implements Item, Comparable<Attraction> {
    private String name;
    private double days;
    private int rating;

    public Attraction(String name, double time, int rating) {
        this.name = name;
        this.days = time;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return days;
    }

    @Override
    public int compareTo(Attraction attraction) {
        return attraction.rating - rating;
    }

    @Override
    public String toString() {
        return "Attraction{" +
                "name='" + name + '\'' +
                ", days=" + days +
                ", rating=" + rating +
                '}';
    }
}
