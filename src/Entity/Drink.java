package Entity;
import java.util.ArrayList;

public class Drink extends Product{

	public Drink(String idProduct, String nameProduct, int amount, double price, ArrayList<Topping> toppings) {
		super(idProduct, nameProduct, amount, price, toppings);
	}
}
