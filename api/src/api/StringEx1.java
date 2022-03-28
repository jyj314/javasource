package api;

public class StringEx1 {

	public static void main(String[] args) {
		
		// 문자열 만들 때 2가지 방법
		// 1.문자열 리터럴을 지정
		// 2String 클래스 생성자 이용
		
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = new String("Hello");
		String str4 = new String("Hello");
		
		System.out.println(str1 == str2);
		System.out.println(str3 == str4);
		
		// 내용비교를 위해서는 equals() 를 써야함
		// 주소비교 할때 == 을 씀

	}

}
