package condition;

import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
			boolean run = true;
			int balance =0; //잔고
		
			while(run ) {
				System.out.println("-----------------------------");
				System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
				System.out.print("선택>");
				
				int menu = sc.nextInt();
//				int dep =sc.nextInt();
//				int with =sc.nextInt();
//				int bal = 10000;				
				
				switch (menu) {
				case 1:
					//예금액 입력받은 후 잔고에 추가			
					System.out.println("예금액 : \n"+"잔고 : "+balance);
					balance += sc.nextInt();
					break;
				case 2:
					// 출금액 입력받은 후 잔고에서 차감
					System.out.println("출금액 : ");
					balance -= sc.nextInt();
					break;
				case 3:
					// 잔고 출력
					System.out.println("잔고 : "+balance);
					break;
				case 4:
					run = false;
					break;
				default:
					break;
				}
				
				
			}
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}
