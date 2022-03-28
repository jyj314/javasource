package exception;

public class LoginEx {

	public static void main(String[] args) {
		
		try {
			login("white","12345");
		} catch (NotExistIDException | WrongPasswordException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			login("blue","54321");
		} catch (NotExistIDException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (WrongPasswordException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static void login(String id, String password) throws NotExistIDException, WrongPasswordException {
		//id 가 blue 가 아니라면 NotExistIdException 발생
		//출력 : 아이디가 존재하지 않습니다.
		if(!id.equals("blue")) {
			throw new NotExistIDException("아이디가 존재하지 않습니다.");
		}
		
		//password가 12345가 아니라면 WrongPasswordException 발생
		// 패스워드가 틀립니다.
		if(!id.equals("blue")) {
			throw new WrongPasswordException("패스워드가 틀립니다.");
	}

}

}