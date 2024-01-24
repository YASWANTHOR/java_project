package polymorphism;

public class Product {
    private double price;

    // Getter method for price
    public double getPrice() {
        return price;
    }

    // Setter method for price
    public void setPrice(double price) {
        this.price = price;
    }

    // Overloaded method for price getter based on quantity
    public double getPrice(int quantity) {
        // Assume a simple logic, for example, multiplying price by quantity
        return price * quantity;
    }

    public static void main(String[] args) {
        // Creating an instance of the polymorphism.Product class
        Product product = new Product();

        // Setting the price using the setter method
        product.setPrice(10.0);

        // Getting the price using the overloaded getter method
        double singlePrice = product.getPrice();
        System.out.println("Price for single quantity: " + singlePrice);

        // Getting the price based on quantity using the overloaded method
        int quantity = 3;
        double totalPrice = product.getPrice(quantity);
        System.out.println("Total price for " + quantity + " quantities: " + totalPrice);
    }
}
