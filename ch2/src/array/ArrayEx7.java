package array;

import java.util.Arrays;

public class ArrayEx7 {

	public static void main(String[] args) {
		// 1~45 번을 가지고 있는 카드 생성
		// 서로 섞은 후 출력
		int card[]= new int[45];
		
		for(int i=0;i<card.length;i++) {
			card[i] = i+1;
		}
		System.out.println(Arrays.toString(card));
		
		int a=10, b=5;
		//a,b 의 값을 교환하고싶음 
		//int z = a; 맞교환이 안돼기때문에 하나를 새로 만들어서 넣어놓고 돌림
		//a = b;
		//b = z;
		
		for(int j=0;j<card.length;j++) {
			// 0~44 
			int pos = (int)(Math.random()*45);
			int temp = card[j];
			card[j] = card[pos];
			card[pos] = temp;
		}
		
		System.out.println(Arrays.toString(card));
	

	}

}
