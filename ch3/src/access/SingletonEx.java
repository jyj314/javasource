package access;

public class SingletonEx {

	public static void main(String[] args) {
		
		Singleton obj1 = Singleton.getIntance();
		Singleton obj2 = Singleton.getIntance();
		
		System.out.println(obj1 == obj2);
		
		Account account1 = new Account("111-11-1234", "홍길동", 10000);
		Account account2 = new Account("111-11-3334", "김길동", 10000);
		System.out.println(account1 == account2);

	}

}
