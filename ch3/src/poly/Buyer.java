package poly;

public class Buyer {
	int money = 1000;
	int bonusPoint = 0;
	
	Product items[] = new Product [10];
	//Tv items[] = new Tv[10];
	//Audio items[] = new Audio[10];
	//Computer items[] = new Computer[10];
	//product 다향성을 쓰면 제품을 구매할때마다 배열을 만들 필요가 없음
	
	int i=0;
	
	void buy(Product p) {
		if (money < p.price) {
			System.out.println("잔액 부족으로 물건 구매 불가");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		items[i++] = p;
		System.out.println(p+ "을/를 구매하였습니다.");
	}
	
//	void buy(Tv p) {
//		if (money < p.price) {
//			System.out.println("잔액 부족으로 물건 구매 불가");
//			return;
//		}
//		
//		money -= p.price;
//		bonusPoint += p.bonusPoint;
//		System.out.println(p+ "을/를 구매하였습니다.");
//	}
//	
//	void buy(Computer p) {
//		if (money < p.price) {
//			System.out.println("잔액 부족으로 물건 구매 불가");
//			return;
//		}
//		
//		money -= p.price;
//		bonusPoint += p.bonusPoint;
//		System.out.println(p+ "을/를 구매하였습니다.");
//	}

}
