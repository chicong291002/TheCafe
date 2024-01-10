package Program;

import java.util.ArrayList;
import java.util.List;

import Controllers.ChatAppController;
import Controllers.OrderController;
import Controllers.ProductController;
import Models.Bill;
import Models.ChatApp;
import Models.Order;
import Models.OrderStatus;
import Models.Product;
import Models.TelegramChatApp;
import Models.Topping;
import Models.ZaloChatApp;
import Repository.ChatAppRepository;
import Repository.IChatAppRepository;
import Repository.IOrderRepository;
import Repository.IProductRepository;
import Repository.OrderRepository;
import Repository.ProductRepository;
import Services.ChatAppService;
import Services.IChatAppService;
import Services.IOrderService;
import Services.IProductService;
import Services.OrderService;
import Services.ProductService;

public class Main {

	public static void main(String[] args) {
		// Tạo các repository
		IProductRepository productRepository = new ProductRepository();
		IChatAppRepository chatAppRepository = new ChatAppRepository();

		// Tạo các service
		IProductService productService = new ProductService(productRepository);
		IChatAppService chatAppService = new ChatAppService(chatAppRepository);

		// Tạo các controller
		ProductController productController = new ProductController(productService);
		ChatAppController chatAppController = new ChatAppController(chatAppService);

		// Tạo sản phẩm và thêm topping
		Topping topping1 = new Topping(1, "Milk", 0.5);
		Topping topping2 = new Topping(2, "Sugar", 0.3);
		List<Topping> toppings = new ArrayList<>();
		toppings.add(topping1);
		toppings.add(topping2);

		Product coffee = new Product("P001", "Coffee", 2, 2, toppings);
		productController.addProduct(coffee);

		List<Product> products = new ArrayList<>();
		products.add(coffee);

		// Tạo đơn hàng và đặt hàng
		Order order1 = new Order(products, OrderStatus.NEW);
		Order order2 = new Order(products, OrderStatus.NEW);

		// Gửi thông báo trạng thái đơn hàng
		ChatApp telegram = new TelegramChatApp("NGUYEN CHI CONG");
		ChatApp zalo = new ZaloChatApp("0948399484");

		chatAppController.sendOrderStatus(telegram, order1);
		chatAppController.sendOrderStatus(zalo, order2);

		// Tạo và gửi bill
		Bill bill1 = new Bill(order1.getOrderId(), order1, order1.getSumMoney());
		Bill bill2 = new Bill(order2.getOrderId(), order2, order1.getSumMoney());

		chatAppController.sendBill(telegram, bill1);
		chatAppController.sendBill(zalo, bill2);
	}
}
