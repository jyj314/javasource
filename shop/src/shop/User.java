package shop;

public class User {
	private String name; //고객명
	private PayType payTypes;	// 결제방법
	public User(String name, PayType payTypes) {
		super();
		this.name = name;
		this.payTypes = payTypes;
	}
	public String getName() {
		return name;
	}
	public PayType getPayTypes() {
		return payTypes;
	}
	

}
