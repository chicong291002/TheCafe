package Service;

import java.util.ArrayList;

import Entity.Order;

public class EmployeeService implements IEmployeeService {
	private IOrderService _IorderService;

	public EmployeeService(IOrderService IorderService) {
		this._IorderService = IorderService;
	}

	@Override
	public float sendBillOrder(Order order) {
		float sum = 0;
		sum += order.getSumMoney();
		return sum;
	}

	@Override
	public void updateOrder(Order order) {
		_IorderService.updateOrder(order);
		order.setStatus("Done Processing");
	}

	@Override
	public ArrayList<Order> listProcessOrder() {
		return _IorderService.listProcessOrder();
	}
}
	