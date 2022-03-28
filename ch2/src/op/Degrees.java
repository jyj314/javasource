package op;

import java.util.Scanner;

public class Degrees {

	public static void main(String[] args) {
		//화씨온도 => 섭씨 온도
		//화씨온도 입력받은 후 섭씨 온도로 변환하기
		//섭씨온도 = (화씨온도 -32 )*5/9
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("화씨온도");
		
		int fahr = sc.nextInt();
		
		// 5/9 => 나머지 (0)
		// 5/9.0 => 나머지(0......)
		double celsius = (fahr-32)*5/9.0;
		
		System.out.println("섭씨온도 "+celsius);
		//format 지정 :%f(실수형), %d(정수형), %c(문자-''), %s(문자열-"")
		//.3f 소수점 3자리까지만 나오게 하고싶어
		System.out.printf("섭씨온도 :%.3f \n",celsius);
		//printf는 엔터가 없음 ln이 엔터  \n을 넣어줘야됨
		System.out.println("프로그램종료");
		
		sc.close();
		

	}

}
