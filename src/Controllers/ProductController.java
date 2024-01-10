package Controllers;
import Models.Product;
import Services.IProductService;

public class ProductController {

	private IProductService _productService;
	public ProductController(IProductService productService) {
		this._productService = productService;
	}

	public void addProduct(Product product) {
		_productService.addProduct(product);
	}
	
	public Product getProductById(int productId) {
		return _productService.getProductById(productId);
	}
}
