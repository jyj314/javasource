package api;

public class IndexOf {

	public static void main(String[] args) {
		String str1 = "자바 프로그래밍";
		
		//indexOf() : 문자열 위치를 인덱스로 돌려줌
		int pos = str1.indexOf("프");
		System.out.println(pos);
		
		System.out.println(str1.indexOf("크")); //문자열에서 못찾으면 -1
		
		if(str1.indexOf("자바")==-1) {
			System.out.println("자바 문자열 없음");
		}else {
			System.out.println("자바 문자열 있음");
		}
		
		String str2 = new String("HelloHelloHello World");
		
		System.out.println(str2.indexOf('o')); //가장 처음 위치하는 걸 찾아줌
		System.out.println(str2.lastIndexOf('o')); //가장 마지막에 위치하는 걸 찾아줌
		System.out.println(str2.indexOf('o', 6)); // 'o'를 찾는데 6번부터 찾아봐라 : 시작위치 지정 가능

	}

}
