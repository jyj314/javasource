package condition;

import java.util.Scanner;

public class Pay0fHours {

	public static void main(String[] args) {
		// 사용자로부터 근무시간을 입력받기
		// 근무시간 중 8 시간 까지는 시간당 9800원 지급
		// 8시간을 초과하는 근무시간은 시간당 급여의 1.5배 추가지급하는 프로그램 작성
		
	Scanner sc = new Scanner(System.in);
	System.out.println("근무시간");
	int num = sc.nextInt();
	
//	if(num<=8) {
//		System.out.println(num*9800);
//	}else if(num>8) {
//		System.out.println((num-8)*9800*1.5+(8*9800));
//	}
	
	int pay =0, rate = 9800;
	if(num > 8) {
		pay = (int)((num-8)*1.5*rate)+8*rate;
	}else {
		pay = rate * num;
	}
	
	System.out.println("하루 임금은 "+pay);
	
		
	sc.close();
	}

}
