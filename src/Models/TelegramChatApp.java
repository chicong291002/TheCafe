package Models;

public class TelegramChatApp extends ChatApp{

	private String username;

	public TelegramChatApp(String username) {
		this.username = username;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public void sendMessage(String message) {
		System.out.println("Send to ZaloChatApp user  " + username + " : " + message);

	}
}
