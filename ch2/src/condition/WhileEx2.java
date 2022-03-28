package condition;

public class WhileEx2 {

	public static void main(String[] args) {
		// 1~10 까지 합 구하기
		
		int sum = 0;
		int i=1;
//		for(;i<11;i++) {
//			sum += i;
//		}
		while(i<11) {
			sum+=i;
			i++;
			
		}
		
		System.out.println(i);    // i cannot be resolved to a variable 블럭을 벗어나있기때문{}
		System.out.println("1~10까지  합" +sum);
		
		//1~100까지 더해보기
		
		sum = 0;
//		for(int j=1;j<101;j++) {
//			sum += j;
//		}
		int j=1;
				while(j<101) {
					sum+=j;
					j++;
				}
		
		
		System.out.println("1~100까지 합"+sum);
		

	}

}
