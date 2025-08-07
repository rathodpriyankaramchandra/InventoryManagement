package Inventory;


import java.util.Scanner;
public class InventoryApp {

	private static final Scanner scanner = new Scanner(System.in);
    private static final InventoryManager inventoryManager = new InventoryManager();
public static void main(String[] args) {
        while (true) {
            System.out.println("1. Add Product");
            System.out.println("2. Update Product");
            System.out.println("3. Delete Product");
            System.out.println("4. Search Product");
            System.out.println("5. View Inventory");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    updateProduct();
                    break;
                case 3:
                    deleteProduct();
                    break;
                case 4:
                    searchProduct();
                    break;
                case 5:
                    viewInventory();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    private static void addProduct() {
        System.out.print("Enter Product ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.print("Enter Product Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Product Price: ");
        double price = scanner.nextDouble();
        System.out.print("Enter Product Quantity: ");
        int quantity = scanner.nextInt();
        Product product = new Product(id, name, price, quantity);
        inventoryManager.addProduct(product);
        System.out.println("Product added successfully.");
    }

    private static void updateProduct() {
        System.out.print("Enter Product ID to update: ");
        int id = scanner.nextInt();
        System.out.print("Enter new quantity: ");
        int quantity = scanner.nextInt();
        if (inventoryManager.updateProduct(id, quantity)) {
            System.out.println("Product updated successfully.");
        } else {
            System.out.println("Product not found.");
        }
    }

    private static void deleteProduct() {
        System.out.print("Enter Product ID to delete: ");
        int id = scanner.nextInt();
        if (inventoryManager.deleteProduct(id)) {
            System.out.println("Product deleted successfully.");
        } else {
            System.out.println("Product not found.");
        }
    }

    private static void searchProduct() {
        System.out.print("Enter Product ID to search: ");
        int id = scanner.nextInt();
        try {
            Product product = inventoryManager.searchProduct(id);
            System.out.println(product);
        } catch (ProductNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void viewInventory() {
        System.out.println("Inventory List:");
        inventoryManager.viewInventory().forEach(System.out::println);
    }
}