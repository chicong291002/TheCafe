package Controllers;

import Models.Bill;
import Models.ChatApp;
import Models.Order;
import Services.IChatAppService;

public class ChatAppController {
	private IChatAppService _chatAppService;

	public ChatAppController(IChatAppService chatAppService) {
		this._chatAppService = chatAppService;
	}

	public void sendOrderStatus(ChatApp chatApp, Order order) {
		_chatAppService.sendOrderStatus(chatApp, order);
	}

	public void sendBill(ChatApp chatApp, Bill bill) {
		_chatAppService.sendBill(chatApp, bill);
	}
}
