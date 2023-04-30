package Entity;
public class Employee {
	
	private String idEmployee;
	private String nameEmployee;
	private String address;
	private String phone;
	
	public Employee(String idEmployee, String nameEmployee, String address, String phone) {
		super();
		this.idEmployee = idEmployee;
		this.nameEmployee = nameEmployee;
		this.address = address;
		this.phone = phone;
	}
	
	public String getIdEmployee() {
		return idEmployee;
	}
	public void setIdEmployee(String idEmployee) {
		this.idEmployee = idEmployee;
	}
	public String getNameEmployee() {
		return nameEmployee;
	}
	public void setNameEmployee(String nameEmployee) {
		this.nameEmployee = nameEmployee;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
