package classtest;

public class GoodsStockEx {

	public static void main(String[] args) {
		GoodsStock goods1 = new GoodsStock("P1010", 100);
		
		System.out.println("제품번호 : "+goods1.code);
		System.out.println("현재 재고수량 : "+goods1.stockNum);
				
		// 입고,출고된 상황
		// 메소드 호출
		// 결과값이 넘어오는 경우 처리하기
		// 1. 출력문 사용하기 ( 넘어오는 값을 화면에 보여주고 다시 사용안하는 경우)
		// 2. 변수에 담기 ( 변수에 담기(출력 + 다시사용)
		
		//200개가 입고된 상황
		//goods1.addStock(200);
		System.out.println("입고후 현재 재고수량 : "+ goods1.addStock(200)); //1. 출력문 사용하기
		
		
		// 150개가 출고된 상황
		//goods1.subtractStock(150);
		int stockNum = goods1.subtractStock(150);
		System.out.println("출고후 현재 재고수량 : "+stockNum);

	}

}
