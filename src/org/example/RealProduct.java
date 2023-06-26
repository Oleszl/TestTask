package org.example;

public class RealProduct extends Product {
    private final int size;
    private final int weight;

    public RealProduct(String name, double price, int size, int weight) {
        super(name, price);
        this.size = size;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "RealProduct{" +
               super.toString() +
               ", size=" + size +
               ", weight=" + weight +
               '}';
    }
}
