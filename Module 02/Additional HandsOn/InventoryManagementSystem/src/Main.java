import java.util.*;


class Product {
    int productId;
    String productName;
    int quantity;
    double price;

    public Product(int productId, String productName, int quantity, double price) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product ID: " + productId + ", Name: " + productName +
               ", Quantity: " + quantity + ", Price: ₹" + price;
    }
}

class InventoryManager {
    HashMap<Integer, Product> inventory = new HashMap<>();
    public void addProduct(Product p) {
        inventory.put(p.productId, p);
        System.out.println("Product added successfully.");
    }
    public void updateProduct(int id, int newQuantity, double newPrice) {
        if (inventory.containsKey(id)) {
            Product p = inventory.get(id);
            p.quantity = newQuantity;
            p.price = newPrice;
            System.out.println("Product updated.");
        } else {
            System.out.println("Product not found.");
        }
    }
    public void deleteProduct(int id) {
        if (inventory.containsKey(id)) {
            inventory.remove(id);
            System.out.println("Product deleted.");
        } else {
            System.out.println("Product not found.");
        }
    }

    public void displayInventory() {
        for (Product p : inventory.values()) {
            System.out.println(p);
        }
    }
}

public class Main {

	public static void main(String[] args) {
		InventoryManager im = new InventoryManager();
        im.addProduct(new Product(101, "Laptop", 10, 55000));
        im.addProduct(new Product(102, "Mouse", 50, 499));
        im.updateProduct(101, 12, 54000);
        im.deleteProduct(102);
        im.displayInventory();
    }
}
