package exception;

public class CheckedException {
	public static void main(String[] args) {
		// Checked Exception 코드를 치자마자 빨간줄이감
		try {
			Class.forName(null);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
