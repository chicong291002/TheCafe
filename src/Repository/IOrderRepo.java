package Repository;
import java.util.ArrayList;
import Entity.Order;

public interface IOrderRepo {
	Order createOrder(Order order);
	void updateOrder(Order order);
	ArrayList<Order> listProcessOrder();
}
