package extend;

public class DMBCellPhone extends CellPhone {
	int channel;
	
	void turnOn(){
		System.out.println("채널 "+channel +"번 방송 시작");
	}
	void turnOff(){
		System.out.println("채널 "+channel +"번 방송 종료");
	}
	void changeChannel(){
		System.out.println("채널 "+channel +"번 방송 종료");
	}
	
	

}
