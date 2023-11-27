package SS8.test.service;
import SS8.test.model.Product;
import SS8.test.repository.ProductRepository;

import java.util.List;

public class ProductService {
    private ProductRepository productRepository;

    public ProductService() {
        productRepository = new ProductRepository();
    }

    public void addProduct(Product product) {
        productRepository.addProduct(product);
    }

    public void deleteProduct(int id) {
        productRepository.deleteProduct(id);
    }

    public void updateProduct(Product updatedProduct) {
        productRepository.updateProduct(updatedProduct);
    }

    public List<Product> getAllProducts() {
        return productRepository.getAllProducts();
    }
}
