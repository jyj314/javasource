package exception;

public class BalanceInsufficientException extends Exception {
	
	private static final long serialVersionID = 1L;
		
	public BalanceInsufficientException() {
		super();
	}
	public BalanceInsufficientException(String message) {
		super(message);
	}
	

}
