package Main;

import java.util.ArrayList;
import java.util.List;

import Entity.Order;
import Entity.Product;
import Entity.Topping;
import Entity.Cake;
import Entity.Drink;
import Repository.OrderServiceRepo;
import Service.BillService;
import Service.EmployeeService;
import Service.OrderService;

public class Program {
	public static void main(String[] args) {
		// Topping
		Topping tp2 = new Topping("TOP4", "Sữa", 5000);
		Topping tp3 = new Topping("TOP5", "Kem", 2000);
		Topping tp4 = new Topping("TOP6", "Dâu", 3000);
		Topping tp5 = new Topping("TOP7", "Đường", 1000);
		Topping tp6 = new Topping("TOP8", "Đá", 1000);

		ArrayList<Topping> list_topping_0 = new ArrayList<Topping>(); // List Topping
		list_topping_0.add(tp2); // add Topping
		list_topping_0.add(tp3);
		list_topping_0.add(tp4);

		ArrayList<Topping> tp7 = new ArrayList<Topping>();
		tp7.add(tp5);
		tp7.add(tp6);

		// Product
		Product p1 = new Cake("P1", "Bánh Dâu", 1, 10000, list_topping_0);
		Product p2 = new Cake("P2", "Bánh Kem", 2, 10000, list_topping_0);
		Product p3 = new Drink("P3", "Cafe Sữa", 1, 15000, tp7);
		Product p4 = new Drink("P4", "Cafe đen", 1, 15000, tp7);

		ArrayList<Product> list_Product_0 = new ArrayList<Product>();
		list_Product_0.add(p3);// add data to list_Product
		list_Product_0.add(p4);

		ArrayList<Product> list_Product_1 = new ArrayList<Product>(); // List Product
		list_Product_1.add(p1);
		list_Product_1.add(p2);

		// Order
		Order od1 = new Order(list_Product_0, "Processing");
		Order od2 = new Order(list_Product_1, "Processing");
		Order od3 = new Order(list_Product_1, "Processing");
		Order od4 = new Order(list_Product_0, "Processing");
		
		// orderService
		OrderService orderService = new OrderService(new OrderServiceRepo());
		orderService.createOrder(od1);
		orderService.createOrder(od2);
		orderService.createOrder(od3);
		orderService.notify_Emp_Service();

		// employeeService
		EmployeeService employeeService = new EmployeeService(orderService);
		List<Order> orders = employeeService.listProcessOrder();
		for (Order order : orders) {
			System.out.println(order.getIdOrder() + " === " + order.getStatus());
			employeeService.updateOrder(order);
		}
		
		System.out.println("Sum Money Order :" + employeeService.sendBillOrder(od1));
		System.out.println("Sum Money Order :" + employeeService.sendBillOrder(od2));
		System.out.println("Sum Money Order :" + employeeService.sendBillOrder(od3));
		
		// billService
		BillService billService = new BillService();
		billService.sendBillClient("Xong roi nha");

		
		//orderService
		orderService.createOrder(od4);
		orderService.notify_Emp_Service();
		
		//employeeService
		orders = employeeService.listProcessOrder();
		for (Order order : orders) {
			System.out.println(order.getIdOrder() + " === " + order.getStatus());
			employeeService.updateOrder(order);
		}
		System.out.println("Sum Money Order :" + employeeService.sendBillOrder(od4));
		
		//billService
		billService.sendBillClient("Xong roi nha");
	}
}
