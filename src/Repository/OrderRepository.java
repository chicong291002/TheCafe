package Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Models.Order;
import Models.OrderStatus;

public class OrderRepository implements IOrderRepository {

	Map<Integer, Order> orders;

	public OrderRepository() {
		orders = new HashMap<>();
	}

	@Override
	public void createOrder(Order order) {
		orders.put(order.getOrderId(), order);
	}

	@Override
	public void updateOrder(Order order) {
		orders.put(order.getOrderId(), order);
	}

	@Override
	public void deleteOrder(int orderId) {
		orders.remove(orderId);
	}

	@Override
	public List<Order> listProcessOrder() {
		List<Order> processOrders = new ArrayList<>();
		for (Order order : orders.values()) {
			if(order.getStatus().equals(OrderStatus.IN_PROGRESS)) {
				processOrders.add(order);
			}
		}
		return processOrders;
	}

}
