package Assessment5;

public class shapedemo {

	public static void main(String[] args) {
		
	       // Create a Circle object with a specific radius
	        circle circle = new circle(10.5f);
	        rectangle rectangle = new rectangle(12.2f,34.1f);
	        square square = new square(36.0f);

	        // Call the getArea method to calculate and display the area
	        circle.calArea();
	        
	        rectangle.calArea();
	        
	        square.calArea();

	}

}
