package Controllers;

import Models.Order;
import Services.IOrderService;

public class OrderController {
	private IOrderService _orderService;

	public OrderController(IOrderService orderService) {
		this._orderService = orderService;
	}

	public void createOrder(Order order) {
		_orderService.createOrder(order);
	}

	public void updateOrder(Order order) {
		_orderService.updateOrder(order);
	}

	public void deleteOrder(int orderId) {
		_orderService.deleteOrder(orderId);
	}
}
