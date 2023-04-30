package Service;
import java.util.ArrayList;
import Entity.Order;
import Repository.IOrderRepo;

public class OrderService implements IOrderService {
	private IOrderRepo _iIOrderRepo;

	@Override
	public void notify_Emp_Service() {
		System.out.println("have a process to be handled");
	}

	public OrderService(IOrderRepo orderResponsitory) {
		this._iIOrderRepo = orderResponsitory;
	}

	@Override
	public Order createOrder(Order order) {
		return _iIOrderRepo.createOrder(order);
	}

	@Override
	public void updateOrder(Order order) {
		_iIOrderRepo.updateOrder(order);
	}

	@Override
	public ArrayList<Order> listProcessOrder() {
		return _iIOrderRepo.listProcessOrder();
	}
}
