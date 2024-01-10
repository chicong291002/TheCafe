package Services;

import Models.Bill;
import Models.ChatApp;
import Models.Order;

public interface IChatAppService {
	void sendOrderStatus(ChatApp chatApp,Order order);
	void sendBill(ChatApp chatApp, Bill bill);
}
