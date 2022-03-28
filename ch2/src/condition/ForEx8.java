package condition;

public class ForEx8 {

	public static void main(String[] args) {
		/*
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 * 5행 5열짜 이런모양으로 별을 찍고싶다
		 */

//		for(int j=1;j<=1;j++) {
//			System.out.print("*");
//		}
//		
//		System.out.println();
//		
//		for(int j=1;j<=2;j++) {
//			System.out.print("*");
//		}
//		
//		System.out.println();
//		
//		for(int j=1;j<=3;j++) {
//			System.out.print("*");
//		}
//		System.out.println();
//		
//		for(int j=1;j<=4;j++) {
//			System.out.print("*");
//		}
//		System.out.println();
//		
//		for(int j=1;j<=5;j++) {
//			System.out.print("*");
//		}
		
	for(int i=1;i<=5;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print("*");
		}
	
		System.out.println();
	}
		
	System.out.println();
	
	for(int i=1;i<=5;i++) {
		for(int j=1;j>=i;j++) {
			System.out.print("*");
		if(j<=i) {
		
		}else  {
			System.out.print(" ");
		}
	}
	System.out.println();
	}
	
	
	
	
	}
}
