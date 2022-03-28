package api;

public class SystemEx1 {

	public static void main(String[] args) {

//		for(int i=0;i<10;i++) {
//			System.out.print(i+"\t");
//			
//			if(i==5)
//				System.exit(0); //프로그램 종료
//		}
		
		long sum = 0;
		
		// System.nanoTime()
		
		long start = System.currentTimeMillis(); // 타임재는거 시작 천분의1초
		for(int i=1;i<10000000;i++) {
			sum+=i;
		}
		long end = System.currentTimeMillis(); // 타임 재는거 끝 천분의1초
		System.out.println("1~10,000,000 합 : "+sum);
		System.out.println("1~10,000,000 합 구하는 데 걸리는 시간 : "+(end-start)+"ms");

	}

}
