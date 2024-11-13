package Assessment5;

public class circle extends shape {
	private float radius;

	public circle(float radius) {
		this.radius = radius;
	}


	void  calArea() {
		area = (float) (Math.PI * radius * radius);
		show();
	}


}



