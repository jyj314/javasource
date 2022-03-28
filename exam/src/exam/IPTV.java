package exam;

public class IPTV extends ColorTV {
	private String address;
	

	public IPTV(int size, int color, String address) {
		super(size, color);
		this.address = address;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	int printProperty() {
		System.out.println("나의 IPTV는 "+address+"주소의 "+getSize()+"인치 "+getColor()+"컬러");
		return 0;
	}

}
