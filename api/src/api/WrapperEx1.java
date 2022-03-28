package api;

/*
 * Wrapper 클래스
 * 기본형 타입을 객체로 다루기 위한 클래스
 * 
 * int => Integer(Integer.parseInt())
 * boolean => Boolean(Boolean.parseInt())
 * byte => Byte
 * short => Short
 * char => Character
 */

public class WrapperEx1 {
	public static void main(String[] args) {
		
		Boolean b = Boolean.valueOf(true);
		Integer i = Integer.valueOf(100); //Integer i = new Integer(100) 구버전부터 제거
										  //i. 해서 불러오기사용가능
		
		int i2 = 100;					 //ㅑ. 불러오기 사용불가
		
		System.out.println(i == i2);
		System.out.println(i.equals(i2));

	}

}
