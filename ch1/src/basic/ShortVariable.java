package basic;

public class ShortVariable {
	public static void main(String[] args) {
		// short : 2byte 사용 2의16승
		// -32768 ~ 32767
		short s1 = 200;
		s1 = 350;
		// + : 연결(변수 앞, 뒤쪽으로 문자열("")이 존재한는 경우)
		System.out.println("s1 = "+s1);
		
		byte b1 =12;
		short s2 =25;
		// + : 산술연산 (변수끼리 더하기는 그냥 산수)
		
		//short result= b1 + s2;
		
		System.out.println(b1 + s2);
		
	}
}
