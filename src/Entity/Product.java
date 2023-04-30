package Entity;

import java.util.ArrayList;

public abstract class Product {

	private String idProduct;
	private String nameProduct;
	private int amount;
	private double price;
	private ArrayList<Topping> toppings = new ArrayList<>();

	public Product(String idProduct, String nameProduct, int amount, double price, ArrayList<Topping> toppings) {
		super();
		this.idProduct = idProduct;
		this.nameProduct = nameProduct;
		this.amount = amount;
		this.price = price;
		this.toppings = toppings;
	}

	public String getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(String idProduct) {
		this.idProduct = idProduct;
	}

	public String getNameProduct() {
		return nameProduct;
	}

	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	//Vi phạm Single Principle 
	public double getSumMoney() {
		double sum = 0;
		for (Topping topping : toppings) {
			sum += topping.getPrice();
		}
		double kq = (sum + getPrice() * getAmount());
		return kq;
	}
}
