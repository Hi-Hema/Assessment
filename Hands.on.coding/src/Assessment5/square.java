package Assessment5;

public class square extends shape {
	private float length;
	
	public square(float length) {
		this.length = length;
	}

	void calArea() {
		area = length*length;
		show();

}
}



