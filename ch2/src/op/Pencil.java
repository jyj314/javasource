package op;

// 변수명
// 소문자로 시작 (대소문자 구별) - filename fileNAme 은 서로 다른 변수명
// 두개의 단어가 붙을 경우 첫 문자를 대문자로 한다. (관례) - firstName, maxSpeed
// UTF8 유니코드기 때문에 한글이 되긴하지만 왠만하면 영어로
// 특수문자 허용 : $, _ 달러표시 언더바 두개만 허용

public class Pencil {

	public static void main(String[] args) {
		// 534자루의 연필을 3-명의 학생들에게 똑같은 개수로 나눌때 학생 당 몇 개를 가질 수 있고
		// 최종적으로 몇개가 남는지 출력하시오.
		// 변수 사용, 산술 연산자 사용
	int pencil = 534;
	int person = 30;
	int each = pencil / person;
	int left = pencil % person;
	//System.out.println("each ="+each);
	//System.out.println("left ="+left);
	System.out.println("each ="+pencil / person);
	System.out.println("left ="+pencil % person);

	
	}

}
