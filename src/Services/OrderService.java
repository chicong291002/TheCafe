package Services;

import java.util.List;

import Models.Order;
import Repository.IOrderRepository;

public class OrderService implements IOrderService{
	IOrderRepository _orderRepository;
	
	public OrderService(IOrderRepository orderRepository) {
		this._orderRepository = orderRepository;
	}

	@Override
	public void createOrder(Order order) {
		_orderRepository.createOrder(order);
	}

	@Override
	public void updateOrder(Order order) {
		_orderRepository.updateOrder(order);
	}

	@Override
	public void deleteOrder(int orderId) {
		_orderRepository.deleteOrder(orderId);
	}

	@Override
	public List<Order> listProcessOrder() {
		return _orderRepository.listProcessOrder();
	}
	
}
