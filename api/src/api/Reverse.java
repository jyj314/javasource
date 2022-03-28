package api;

public class Reverse {

	public static void main(String[] args) {
		String str = "ABzquartK";
		
		//거꾸로출력-for문이용
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i)+" ");
		}
		
		System.out.println();
		//거꾸로출력-배열로 출력
		char[] chArr = str.toCharArray();
		for(int i=chArr.length-1;i>=0;i--) {
			System.out.print(chArr[i]);
		}
		
		
		System.out.println();
		//거꾸로 출력-stringbuilder
		StringBuilder sb = new StringBuilder(str);
//		StringBuilder rev = sb.reverse();
//				
//		System.out.println(str);
//		System.out.println(rev);
		System.out.println(sb.reverse());
		


	}

}
