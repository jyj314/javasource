package classtest;

import java.net.Socket;

public class GoodsStock{
	String code;
	int stockNum;
	
	//생성자
	public GoodsStock() {
		// default 생성자
		super();
		
	}
	public GoodsStock(String code) {
		super();
		this.code = code;
	}
	public GoodsStock(String code, int stockNum) {
		super();
		this.code = code;
		this.stockNum = stockNum;
	}



// 재고추가 : 재고수량을 입력받아서 현재 재고수량
int addStock(int amount) {
	stockNum += amount; // stockNum = stockNum + amount
	return stockNum; // 메소드를 호출한 곳으로 값을 보내기
	}


// 재고감소 : 판매수량을 입력받아서 현재 재고수량
int subtractStock(int amount) {
	stockNum -= amount; //
	return stockNum;
	}


}
 
 
 