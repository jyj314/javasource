package array;

public class ArrayEx6 {

	public static void main(String[] args) {
		// 10명의 점수를 배열로 생성하고
		// 최대값, 최소값 출력
		int score[]= {79,88,91,33,100,55,95,45,48,82};
		
		int max = score[0];
		int min = score[0];
		
		int i = 0;
		for(i=1;i<score.length;i++) //[0]은 max min 에 담았기때문에 1부터 시작
			if(max < score[i]);{
				max = score[i];
			}
		for(i=1;i<score.length;i++) //[0]은 max min 에 담았기때문에 1부터 시작
			if(min > score[i]);{
				min = score[i];
			}
			
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);
				
				
			
				

	}

}
