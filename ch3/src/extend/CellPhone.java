package extend;

//CellPhone:
//model
//color
//전원을 켜고 끄기
//벨이 울린다
//메세지 주고 받기
//전화 끊기
//
//DMB Cell Phone:
//CellPHONE 
//DMB 기능추가

public class CellPhone {
	String model;
	String color;
	
	void powerOn() {
		System.out.println("전원을 켭니다");
	}
	void powerOff() {
		System.out.println("전원을 끕니다");
	}
	void bell() {
		System.out.println("벨이 울립니다");
	}
	void sendVoice(String msg) {
		System.out.println("본인 : "+msg);
	}
	void recieveVoice(String msg) {
		System.out.println("상대방 : "+msg);
	}
	void hangup() {
		System.out.println("전화를 끊습니다");
	}
	
	

}
