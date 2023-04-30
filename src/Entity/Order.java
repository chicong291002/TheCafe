package Entity;

import java.util.ArrayList;

public class Order {
	private String idOrder;
	private ArrayList<Product> products = new ArrayList<>();
	public ArrayList<Product> getProducts() {
		return products;
	}

	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}

	private String status;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Order() {
	}

	public Order(String idOrder) {
		this.idOrder = idOrder;
	}

	public Order(ArrayList<Product> list_Product_0, String status) {
		this.products = list_Product_0;
		this.status =  status;
	}

	public Order(String ID, ArrayList<Product> listPro, String status) {
		this.idOrder = ID;
		this.products = listPro;
		this.status = status;
	}

	public String getIdOrder() {
		return idOrder;
	}

	public void setIdOrder(String idOrder) {
		this.idOrder = idOrder;
	}
	
	public double getSumMoney() {
		double sum = 0;
		for (Product product : products) {
			sum += product.getSumMoney();
		}
		return sum;
	}
}
