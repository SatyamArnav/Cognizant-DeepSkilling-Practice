import java.util.*;

class Product {
    int productId;
    String productName;
    String category;

    Product(int id, String name, String cat) {
        this.productId = id;
        this.productName = name;
        this.category = cat;
    }

    public static int linearSearch(Product[] pr, String name) {
        for (int i = 0; i < pr.length; i++) {
            if (pr[i].productName.equalsIgnoreCase(name)) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(Product[] products, String name) {
        int left = 0, right = products.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int compare = products[mid].productName.compareToIgnoreCase(name);

            if (compare == 0) return mid;
            else if (compare < 0) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }
}

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(1, "Shampoo", "Personal Care"),
            new Product(2, "Laptop", "Electronics"),
            new Product(3, "Book", "Education"),
            new Product(4, "Mobile", "Electronics")
        };

        int index1 = Product.linearSearch(products, "Book");
        System.out.println("Linear Search: Found at index " + index1);
        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));
        int index2 = Product.binarySearch(products, "Laptop");
        System.out.println("Binary Search: Found at index " + index2);
    }
}
