package Service;

public class BillService implements IBillService {
	public void sendBillClient(String message) {
		System.out.println("Send Bill Client:" + message);
	}
	
}
