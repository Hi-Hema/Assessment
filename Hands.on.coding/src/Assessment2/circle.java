package Assessment2;

import java.util.Scanner;

public class circle {


	class Circle {
	    
	    private double radius;
	    private String colour;

	    
	    public void getInput() {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter radius of the circle: ");
	        radius = scanner.nextDouble();
	        
	        System.out.print("Enter colour of the circle: ");
	        colour = scanner.next();
	    }

	    
	    public void calcArea() {
	        double area = Math.PI * radius * radius;
	        System.out.println("The area of the circle with radius " + radius + " is: " + area);
	    }

	    
	    public void displayColour() {
	        System.out.println("The colour of the circle is: " + colour);
	    }
	}

	

}


