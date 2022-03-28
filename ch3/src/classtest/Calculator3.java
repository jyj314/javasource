package classtest;

public class Calculator3 {
	long a, b; // 인스턴스 변수( 멤버 변수)
	
	//멤버 메소드 (인스턴스 메소드)
	long add() {
		return a+b;
	}
	long subtract() {
		return a-b;
	}
	long multiply() {
		return a*b;
	}
	long devide() {
		return a/b;
	}
	
	//클래스 메소드
	//static - 공유, 객체생성없이 사용가능
	//인스턴스 변수, 인스턴스 메소드 사용불가
	//static long add2() {
	//  Cannot make a static reference to the non-static field
	//	return a + b;
	//  add();
	
	static long add(long c, long d) {
		return c+d;
	}
	static long subtract(long c, long d) {
		return c-d;
	}
	static long multiply(long c, long d) {
		return c*d;
	}
	static long divide(long c, long d) {
		return c/d;
	}

}
