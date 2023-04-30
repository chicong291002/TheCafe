package Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

import Entity.Order;

public class OrderServiceRepo implements IOrderRepo {

	private static final AtomicInteger counter = new AtomicInteger(0);
	private HashMap<String, Order> listOrder = new HashMap<>();

	@Override
	public synchronized Order createOrder(Order order) {
		order = new Order((counter.getAndIncrement()) + "", order.getProducts(), order.getStatus());
		listOrder.put(order.getIdOrder(), order);
		return order;
	}

	@Override
	public void updateOrder(Order order) {
		listOrder.put(order.getIdOrder(), order);
	}

	@Override
	public ArrayList<Order> listProcessOrder() {
		ArrayList<Order> listProcessOrder = new ArrayList<>();
		
		for (String key : listOrder.keySet()) {
			if (listOrder.get(key).getStatus().equals("Processing")) {
				listProcessOrder.add(listOrder.get(key));
			}
		}
		return listProcessOrder;
	}
}
