package condition;

public class ContinueEx2 {

	public static void main(String[] args) {
		// 0~10까지의 숫자 중에서 짝수만 출력 (continue 사용)
		
//		for(int i=0;i<=10;i++) {
//			if(i%2!=0) {
//				continue;  //홀수인 경우 출력문 실행안됨
//			}
//			System.out.println(i+" ");
//		}
		
		//1~100까지 숫자중에서 홀수의 합만 구해서 출력
		
		int sum = 0;
		for(int i=1;i<101;i++) {
			if(i%2==0){
				continue;
			}
			
			//sum +=i;   // sum = sum + i;
				
			}
			System.out.println("1~100 까지의홀수합 "+sum);
		
		
	}

}
