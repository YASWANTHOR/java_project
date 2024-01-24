package ComparableComparatorEquals.ProductComparable;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Create some polymorphism.Product instances
        Product product1 = new Product(1, 2.5, 50.0);
        Product product2 = new Product(2, 1.5, 30.0);
        Product product3 = new Product(3, 3.0, 40.0);

        // Put them in an array
        Product[] products = {product1, product2, product3};

        // Print the products before sorting
        System.out.println("Before sorting:");
        for (Product product : products) {
            System.out.println(product);
        }

        // Sort the products by price
        Arrays.sort(products);

        // Print the products after sorting
        System.out.println("\nAfter sorting:");
        for (Product product : products) {
            System.out.println(product);
        }
    }
}

