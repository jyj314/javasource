package condition;

public class ForEx7 {

	public static void main(String[] args) {
		
		
		// 첫번째 int i=1;
		// 두번째 i<4;
		// 세번째 안쪽 for 블럭안으로 진입
		// 네번째 int j=1;
		// 다섯번째 j<4;
		// 여섯번째 안쪽 for 블럭 안으로 진입 => * 출력
		// 일곱번째 j++ (j=2)
		// 여덟번째 j<4;
		// 아홉번째 * 출력 **
		// 열번째 j++ (j=3)
		// 열한번째 j<4 
		// 열두번째 * 출력 ***
		// 열세번째 j++ (j=4)
		// 열네번째 j=4 =>거짓(안쪽 for문 종료)
		// 열다섯째 system.out.println
		
		// 하나 i++ (i=2)
		// 둘 i<4;
		// 세번째 부터 15번째까지 반복
		
		// 하나 i++ (i=3)
		// 둘 i<4;
		// 세번째 부터 15번째까지 반복
		
		// 하나 i++ (i=4)
		// 둘 i<4; 거짓(전체 for 종료)
		
		

		for(int i=1;i<4;i++) {
			for(int j=1;j<4;j++) {
			System.out.print("*");
		}
			System.out.println();
		}
	}

}
