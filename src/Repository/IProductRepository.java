package Repository;

import Models.Product;

public interface IProductRepository {
    void addProduct(Product product);
    Product getProductById(int productId);
}
