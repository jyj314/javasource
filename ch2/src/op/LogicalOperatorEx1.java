package op;


// 논리 연산자 : 결과가 true or false
// && : 논리 곱 and
// || : 논리 합 or    ||백슬래쉬 
// ! : 부정

public class LogicalOperatorEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean result = (5>3) && (5>2);
		System.out.println(result);
		
		result = (5>3) || (5<2); //둘중 하나만 참이면 참으로 나옴 //dead code 앞에것이 맞기때문에 굳이 뒤에껄 넣을 의미가 없음
		System.out.println(result);

	}

}
