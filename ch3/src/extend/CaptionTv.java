package extend;

public class CaptionTv extends TV{

//	String color;
//	boolean power;
//	int channel;
		
	//캡션기능
	boolean caption;
	void display(String text) {
		if(caption) {
			System.out.println(text);
		}
		
		
	}
	
	//기능 : 전원 on/off, 채널 변경
//	void  power() {
//		power = !power;
//	}
//	void channelUP() {
//		channel++;
//	}
//	void channelDown() {
//		channel--;
//	}


}
