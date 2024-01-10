package Services;

import Models.Product;
import Repository.IProductRepository;

public class ProductService implements IProductService{

	IProductRepository _productRepository;
	public ProductService(IProductRepository productRepository) {
		this._productRepository = productRepository;
	}
	@Override
	public void addProduct(Product product) {
		_productRepository.addProduct(product);
		
	}
	@Override
	public Product getProductById(int productId) {
		return _productRepository.getProductById(productId);
	}
		
}
