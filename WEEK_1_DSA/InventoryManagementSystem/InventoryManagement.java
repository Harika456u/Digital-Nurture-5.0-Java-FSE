import java.util.ArrayList;
import java.util.Iterator;

public class InventoryManagement {

    static ArrayList<Product> inventory = new ArrayList<>();

    public static void addProduct(Product product) {
        inventory.add(product);
        System.out.println("Product Added Successfully.");
    }

    public static void updateProduct(int id, int quantity, double price) {

        for (Product product : inventory) {

            if (product.productId == id) {

                product.quantity = quantity;
                product.price = price;

                System.out.println("Product Updated Successfully.");
                return;
            }
        }

        System.out.println("Product Not Found.");
    }

    public static void deleteProduct(int id) {

        Iterator<Product> iterator = inventory.iterator();

        while (iterator.hasNext()) {

            Product product = iterator.next();

            if (product.productId == id) {

                iterator.remove();
                System.out.println("Product Deleted Successfully.");
                return;
            }
        }

        System.out.println("Product Not Found.");
    }

    public static void displayProducts() {

        System.out.println("\nInventory Details");

        for (Product product : inventory) {
            product.display();
        }
    }

    public static void main(String[] args) {

        addProduct(new Product(101, "Laptop", 10, 65000));

        addProduct(new Product(102, "Mouse", 50, 500));

        addProduct(new Product(103, "Keyboard", 25, 1200));

        updateProduct(102, 60, 550);

        deleteProduct(103);

        displayProducts();
    }
}