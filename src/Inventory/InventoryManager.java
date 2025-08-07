package Inventory;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class InventoryManager {

	private List<Product> products = new ArrayList<>();

    // Add Product
    public void addProduct(Product product) {
        products.add(product);
    }

    // Update Product
    public boolean updateProduct(int productId, int quantity) {
        Optional<Product> product = products.stream().filter(p -> p.getId() == productId).findFirst();
        if (product.isPresent()) {
            product.get().setQuantity(quantity);
            return true;
        }
        return false;
    }

    // Delete Product
    public boolean deleteProduct(int productId) {
        return products.removeIf(product -> product.getId() == productId);
    }

    // Search Product by ID or Name
    public Product searchProduct(int productId) throws ProductNotFoundException {
        return products.stream().filter(p -> p.getId() == productId).findFirst()
                .orElseThrow(() -> new ProductNotFoundException("Product not found"));
    }

    // View all products
    public List<Product> viewInventory() {
        return products;
    }

    // Generate Report (Text File)
    public void generateReport() {
        // Write the inventory list to a text file (not implemented for brevity)
    }
}
