package api;

public class MathEx3 {

	public static void main(String[] args) {
		// 반복
		// 1~3 까지 난수(임이의숫자) 3개 생성한 뒤 한줄에 출력
		// 모두 같은 수가 나올때까지 반복, 모두 같은 수이면 종료
		// 1 2 3 
		// 2 1 1 
		// 3 3 3
		
		while(true) {
			int num1 = (int)(Math.random()*3)+1;
			int num2 = (int)(Math.random()*3)+1;
			int num3 = (int)(Math.random()*3)+1;
			System.out.printf("%d\t%d\t%d\n",num1,num2,num3);
			
			
			if(num1 == num2 && num1 == num3) {
				System.out.println("성공");
				break;
			}
		}
	}

	}
