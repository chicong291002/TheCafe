package Services;

import Models.Product;

public interface IProductService {
    void addProduct(Product product);
    Product getProductById(int productId);
}
