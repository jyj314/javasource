package classtest;

public class TvEx {

	public static void main(String[] args) {
		// (default생성자를 호출하면서}객체생성
		TV tv = new TV();
		// 초기화
		tv.color="black";
		tv.channel=3;
		tv.power=false;
		
		// 객체사용
		tv.power(); // 전원켜기 void power { power =!power;}
		System.out.println("현재전원상태 "+tv.power);
		System.out.println("현재채널 "+tv.channel);
		tv.channelUP(); // 채널 번호 증가 void channelUP { channel++;}
		System.out.println("현재채널 "+tv.channel);

	}

}
