package Service;

import java.util.ArrayList;

import Entity.Order;

public interface IEmployeeService {
	void updateOrder(Order order);
	ArrayList<Order> listProcessOrder();
	float sendBillOrder(Order order);
}
