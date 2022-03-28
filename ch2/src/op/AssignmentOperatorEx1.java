package op;

public class AssignmentOperatorEx1 {

	public static void main(String[] args) {
		// 복합대입연산자
		
		int result = 10;
		
		result += 10;      //result = result +10;
		System.out.println("result = "+result);

		result -= 5;	  //result = result -5;
		System.out.println("result = "+result);
		
		result *= 3;     //result = result *3;
		System.out.println("result = "+result);
		
		result /= 5;    //result = result /5;
		System.out.println("result = "+result);
		
		result %= 3;     //result = result %3; 3으로 나눴을때 나머지 0 예를들어 4로나누면 1
		System.out.println("result = "+result);

	}

}
