package exam;

public class ColorTV extends TV {
	private int color;
	public ColorTV(int size, int color) {
		super(size);
		this.color = color;
	}

	public int getColor() {
		return color;
	}
	
	int printProperty() {
		System.out.println(getSize()+"인치 "+color+"컬러");
		return 0;
	}
	


}
