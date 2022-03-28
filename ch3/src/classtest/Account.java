package classtest;

public class Account {
	String accountNo;
	String owner;
	int balance;
	
	public Account(String accountNo, String owner, int balance) {
		super();
		this.accountNo = accountNo;
		this.owner = owner;
		this.balance = balance;
	}
	
	//기능 : 입금한다, 출금한다
	//입금한다 : 입금액을 입력받아 현재 잔액에 추가 / 리턴값으로 현재잔액
	int deposite(int amount) {
		this.balance += amount;
		return balance;
	}
	//출금한다 : 출금액을 입력받아 현재 잔액에 추가 / 리턴값으로 현재잔액
	int withdraw(int amount) {
		balance -= amount;
		return balance;
		
	}

}
