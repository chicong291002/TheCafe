package Models;

public class ZaloChatApp extends ChatApp{

	private String phoneNumber;
	
	public ZaloChatApp(String phone) {
		this.phoneNumber = phone;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public void sendMessage(String message) {
		System.out.println("Send to Telegram user  " + phoneNumber + " : " + message);
	}

}
