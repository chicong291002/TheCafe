package Models;

public class Topping {
	public int toppingId;
	public String toppingName;
	public double Price;

	public int getToppingId() {
		return toppingId;
	}

	public String getToppingName() {
		return toppingName;
	}

	public double getPrice() {
		return Price;
	}

	public void setToppingId(int toppingId) {
		this.toppingId = toppingId;
	}

	public void setToppingName(String toppingName) {
		this.toppingName = toppingName;
	}

	public void setPrice(int price) {
		Price = price;
	}

	public Topping(int toppingId, String toppingName, double price) {
		this.toppingId = toppingId;
		this.toppingName = toppingName;
		Price = price;
	}

	public Topping() {
	}
}
