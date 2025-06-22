import java.util.*;

class Product {
    int productId;
    String productName;
    String category;

    public Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}

public class ECommerceSearch {

    public static Product linearSearch(Product[] products, String targetName) {
        for (Product product : products) {
            if (product.productName.equalsIgnoreCase(targetName)) {
                return product; // Product found
            }
        }
        return null; // Product not found
    }


    public static Product binarySearch(Product[] products, String targetName) {
        int left = 0, right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = products[mid].productName.compareToIgnoreCase(targetName);

            if (comparison == 0) {
                return products[mid]; // Product found
            } else if (comparison < 0) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }
        return null; // Product not found
    }
    public static void main(String[] args) {
        // Array of Products
        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Phone", "Electronics"),
            new Product(3, "Shoes", "Footwear"),
            new Product(4, "Watch", "Accessories")
        };

        // Test Linear Search
        String target = "Shoes";
        Product foundProduct = linearSearch(products, target);
        System.out.println("Linear Search Result: " + (foundProduct != null ? foundProduct : "Not Found"));

        // Sort products by productName for Binary Search
        Arrays.sort(products, Comparator.comparing(product -> product.productName.toLowerCase()));

        // Test Binary Search
        foundProduct = binarySearch(products, target);
        System.out.println("Binary Search Result: " + (foundProduct != null ? foundProduct : "Not Found"));
    }
}
