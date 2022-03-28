package condition;

import java.util.Scanner;

public class MinValue {

	public static void main(String[] args) {
		// 세개의 정수를 입력 받아 가장 작은 수 출력
		// num1 = 35, num2 =25, num3 = 55
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하시오");
		int num1 = sc.nextInt();
		System.out.println("정수를 입력하시오");
		int num2 = sc.nextInt();
		System.out.println("정수를 입력하시오");
		int num3 = sc.nextInt();
		
		//제일 작은 수
		int min = num1;
		if(min >num2) {
		min=num2;
		}
		if(min >num3) {
		min=num3;
		}
		
		System.out.println("가장작은수 : "+min);
		
		// 제일 큰수
		int max = num1;
		if(max <num2) {
		min=num2;
		}
		if(max <num3) {
		max=num3;
		}
		
		System.out.println("가장큰수 : "+max);
		
	}

}
