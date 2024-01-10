package Repository;

import Models.Bill;
import Models.ChatApp;
import Models.Order;

public interface IChatAppRepository {
	void sendOrderStatus(ChatApp chatApp,Order order);
	void sendBill(ChatApp chatApp, Bill bill);
}
