package Entity;
public class Topping {
	private String idTopping;
	private String nameTopping;
	private double price;
	
	public Topping(String idTopping,String nameTopping,double price) {
		this.idTopping = idTopping;
		this.nameTopping = nameTopping;
		this.price = price;
	}

	public String getIdTopping() {
		return idTopping;
	}
	
	public void setIdTopping(String idTopping) {
		this.idTopping = idTopping;
	}
	
	public String getNameTopping() {
		return nameTopping;
	}
	
	public void setNameTopping(String nameTopping) {
		this.nameTopping = nameTopping;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
}
