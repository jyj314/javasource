package basic;

//크기
//byte(1) < short(2) < int(4) < long(8) <float(4) < double(8)

//형(타입)변환
//① 자동형변환(Promotion) : 개발자가 신경쓰지 않아도 됨
//       큰 크기타입 = 작은 크기 타입
//② 강제형변환(Casting) : 컴파일 오류와 관련있기 때문에 신경을 써야 함
//       작은 크기타입 = (작은크기타입) 큰 크기 타입

public class CastingEx1 {

	public static void main(String[] args) {
		int intValue = 1034;
		//byte byteValue = intValue; // cannot convert from int to byte
		System.out.println("intValue = "+intValue);
		
		//강제 형변환 값이 손실됨
		byte byteValue = (byte)intValue; // cannot convert from int to byte
		System.out.println("byteValue ="+byteValue);
		
		
		int num1 = 123456780;
		// 자동형변환
		double num2 = num1;
		System.out.println("num2 = "+num2);
		// 강제형변환
		int num3 = (int)num2;
		System.out.println("num3 = "+num3);

	}

}
