package Assessment3;

public class employee {


	class Commission {
	    // Data Members
	    private String name;
	    private String address;
	    private String phone;
	    private double salesAmount;
	    private double commission;

	    // Method to accept details of the sales employee
	    public void acceptDetails(String name, String address, String phone, double salesAmount) {
	        this.name = name;
	        this.address = address;
	        this.phone = phone;
	        this.salesAmount = salesAmount;
	    }

	    // Method to calculate the commission based on sales amount
	    public void calculateCommission() {
	        if (salesAmount >= 100000) {
	            commission = salesAmount * 0.10;
	        } else if (salesAmount >= 50000) {
	            commission = salesAmount * 0.05;
	        } else if (salesAmount >= 30000) {
	            commission = salesAmount * 0.03;
	        } else {
	            commission = 0;
	        }
	    }

	    // Method to display details and commission
	    public void displayDetails() {
	        System.out.println("Name: " + name);
	        System.out.println("Address: " + address);
	        System.out.println("Phone: " + phone);
	        System.out.println("Sales Amount: " + salesAmount);
	        System.out.println("Commission: " + commission);
	    }
	}

	public class Main {
	    public static void main(String[] args) {
	        // Creating an instance of Student to demonstrate the default constructor
	        employee student = new employee();

	        // Creating an instance of Commission
	        Commission salesEmployee = new Commission();

	        // Accepting details for the sales employee
	        salesEmployee.acceptDetails("John Doe", "123 Main St", "555-1234", 75000);

	        // Calculating commission
	        salesEmployee.calculateCommission();

	        // Displaying details and commission
	        salesEmployee.displayDetails();
	    }
	}
	}


