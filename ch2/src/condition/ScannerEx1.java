package condition;

import java.util.Scanner;

public class ScannerEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 수 : ");
		int num1 = sc.nextInt();
		
		System.out.println("첫번째 수 : ");
		int num2 = sc.nextInt();
		
		System.out.printf("입력한 숫자의 덧셈 결과는 %d",(num1+num2));
		
		
		sc.close();

	}

}
