package Repository;

import java.util.HashMap;
import java.util.Map;

import Exceptions.ProductNotFoundException;
import Models.Product;

public class ProductRepository implements IProductRepository {

	private Map<String, Product> products;

	public ProductRepository() {
		this.products = new HashMap<>();
	}

	@Override
	public void addProduct(Product product) {
		products.put(product.getProductId(), product);
	}

	@SuppressWarnings("unlikely-arg-type")
	@Override
	public Product getProductById(int productId) {
		if (!products.containsKey(productId)) {
				throw new ProductNotFoundException("Product with ID " + productId + " not found");
		}
		return products.get(productId);
	}

}
