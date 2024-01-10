package Models;

public class Bill {
	
	private int billId;
	private Order order;
	private double totalPrice;
	
	public Bill(int billId, Order order, double totalPrice) {
		this.billId = billId;
		this.order = order;
		this.totalPrice = calculateTotalAmount();
	}
	
	public int getBillId() {
		return billId;
	}
	public Order getOrder() {
		return order;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setBillId(int billId) {
		this.billId = billId;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	public int calculateTotalAmount() {
        int total = 0;
        for (Product product : order.getProducts()) {
            total += product.getSum();
        }
        return total;
    }

	@Override
	public String toString() {
		return "billId=" + billId + ", order=" + order.getSumMoney() +" " + order.status + ", totalPrice=" + totalPrice + "";
	}
	
	
	
}
