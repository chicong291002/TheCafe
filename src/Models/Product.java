package Models;

import java.util.ArrayList;
import java.util.List;

public class Product {
	public String productId;
	public String productName;
	public int Amount;
	public int Price;
	public List<Topping> topps;

	public String getProductId() {
		return productId;
	}

	public String getProductName() {
		return productName;
	}

	public int getPrice() {
		return Price;
	}

	public int getAmount() {
		return Amount;
	}

	public void setAmount(int amount) {
		Amount = amount;
	}

	public void setProductId(String productId2) {
		this.productId = productId2;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setPrice(int price) {
		Price = price;
	}

	public Product() {

	}

	public Product(String productId, String productName, int amount, int price, List<Topping> topps) {
		super();
		this.productId = productId;
		this.productName = productName;
		Amount = amount;
		Price = price;
		this.topps = new ArrayList<>();;
	}

	public int getSum() {
		int sum = 0;
		for (Topping topp : topps) {
			sum += topp.getPrice();
		}
		int kq = sum + getAmount() * getPrice();
		return kq;
	}

}
