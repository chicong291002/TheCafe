package Repository;

import Exceptions.ChatAppNotFoundException;
import Models.Bill;
import Models.ChatApp;
import Models.Order;
import Models.TelegramChatApp;
import Models.ZaloChatApp;

public class ChatAppRepository implements IChatAppRepository {

	@Override
	public void sendOrderStatus(ChatApp chatApp, Order order) {
		if (chatApp instanceof TelegramChatApp) {
			TelegramChatApp telegramChatApp = (TelegramChatApp) chatApp;
			String message = "Order status: " + order.getStatus();
			telegramChatApp.sendMessage(message);
		} else if (chatApp instanceof ZaloChatApp) {
			ZaloChatApp zaloChatApp = (ZaloChatApp) chatApp;
			String message = "Order status: " + order.getStatus();
			zaloChatApp.sendMessage(message);
		} else {
			try {
				throw new ChatAppNotFoundException("Chat app not supported");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

	@Override
	public void sendBill(ChatApp chatApp, Bill bill) {
		if (chatApp instanceof TelegramChatApp) {
			TelegramChatApp telegramChatApp = (TelegramChatApp) chatApp;
			String message = "Bill: " + bill.toString();
			telegramChatApp.sendMessage(message);
		} else if (chatApp instanceof ZaloChatApp) {
			ZaloChatApp zaloChatApp = (ZaloChatApp) chatApp;
			String message = "Bill: " + bill.toString();
			zaloChatApp.sendMessage(message);
		} else {
			try {
				throw new ChatAppNotFoundException("Chat app not supported");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
