package SS8.test.controller;
import SS8.test.model.Product;
import SS8.test.service.ProductService;

import java.util.List;

public class ProductController {
    private ProductService productService;

    public ProductController() {
        productService = new ProductService();
    }

    public void addProduct(Product product) {
        productService.addProduct(product);
    }

    public void deleteProduct(int id) {
        productService.deleteProduct(id);
    }

    public void updateProduct(Product updatedProduct) {
        productService.updateProduct(updatedProduct);
    }

    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }
}

