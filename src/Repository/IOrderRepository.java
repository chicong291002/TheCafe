package Repository;

import java.util.List;

import Models.Order;

public interface IOrderRepository {
	public void createOrder(Order order);
	public void updateOrder(Order order);
	public void deleteOrder(int orderId);
	public List<Order>listProcessOrder();
}
