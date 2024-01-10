package Services;

import Models.Bill;
import Models.ChatApp;
import Models.Order;
import Repository.IChatAppRepository;

public class ChatAppService implements IChatAppService{
	private IChatAppRepository _chatAppRepository;
	
	public ChatAppService(IChatAppRepository chatAppRepository) {
		this._chatAppRepository = chatAppRepository;
	}

	@Override
	public void sendOrderStatus(ChatApp chatApp, Order order) {
		_chatAppRepository.sendOrderStatus(chatApp, order);
	}

	@Override
	public void sendBill(ChatApp chatApp, Bill bill) {
		_chatAppRepository.sendBill(chatApp, bill);
	}
}
