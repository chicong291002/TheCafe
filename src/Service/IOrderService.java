package Service;

import java.util.ArrayList;

import Entity.Order;

public interface IOrderService {
	void notify_Emp_Service();
	Order createOrder(Order order);
	void updateOrder(Order order);
	ArrayList<Order> listProcessOrder();
}