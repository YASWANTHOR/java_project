package ComparableComparatorEquals.ProductComparable;

public class Product implements Comparable<Product> {
    private int id;
    private double weight;
    private double price;

    // Constructor
    public Product(int id, double weight, double price) {
        this.id = id;
        this.weight = weight;
        this.price = price;
    }

    // Getter methods for id, weight, and price
    public int getId() {
        return id;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    // compareTo method implementation
    @Override
    public int compareTo(Product other) {
        // Compare based on price
        return Double.compare(this.price, other.price);
    }

    // Optional: Override toString for easy printing of polymorphism.Product details
    @Override
    public String toString() {
        return "polymorphism.Product{" +
               "id=" + id +
               ", weight=" + weight +
               ", price=" + price +
               '}';
    }
}

