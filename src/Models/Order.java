package Models;

import java.util.ArrayList;
import java.util.List;

public class Order {

	private int orderId;
	private List<Product> products;
	OrderStatus status;

	public Order(int orderId) {
		this.orderId = orderId;
		this.products = new ArrayList<>();
		this.status = OrderStatus.NEW;
	}

	public Order() {
		super();
	}

	public int getOrderId() {
		return orderId;
	}

	public List<Product> getProducts() {
		return products;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Order(int orderId, List<Product> products, OrderStatus status) {
		this.orderId = orderId;
		this.products = products;
		this.status = status;
	}

	public Order(List<Product> products, OrderStatus status) {
		this.products = products;
		this.status = status;
	}
	
	public double getSumMoney() {
		double sum = 0;
		for (Product product : products) {
			sum += product.getSum();
		}
		return sum;
	}
}
