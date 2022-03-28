package extend;

public class CaptionTv2 extends TV2{

//	String color;
//	boolean power;
//	int channel;
		
	
	//캡션기능
	boolean caption;
	
		public CaptionTv2(String color, boolean power, int channel, boolean caption) {
		super(color, power, channel);
		this.caption = caption;
	}
	
// Implicit super constructor TV2() is undefined for default constructor.
// must define an explicit constructor

//	private CaptionTv2() {
//		super();   //부모의 생성자 호출
//	}

	
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
