package condition;

import java.util.Scanner;

public class ScannerEx2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 수 : ");
		//int num1 = sc.nextInt();    // 25 => 25
		//String num1 = sc.nextLine();  // 25 => "25"
		
		int num1 = Integer.parseInt(sc.nextLine());  // 35 => "35"
		
		System.out.println("두번째 수 : ");
		//int num2 = sc.nextInt();    // 35 = 35
		//Integer.parseInt("");         //"35" => 35
		
		int num2 = Integer.parseInt(sc.nextLine());  // 35 => "35"
		
		
		System.out.println("사칙연산 중 하나 입력(+,-,*,/,%)");
		
		String op = sc.nextLine();
		
		int result =0;
		
		switch (op) {
		case "+":
			result = (num1+num2);
			break;
		case "-":
			result = (num1-num2);
			break;
		case "*":
			result = (num1*num2);
			break;
		case "/":
			result = (num1/num2);
			break;
		case "%":
			result = (num1%num2);
			break;

		default:
			break;
		}
		System.out.printf("%d %s %d = %d",num1,op,num2,result);
		
		
		sc.close();
	}

}
