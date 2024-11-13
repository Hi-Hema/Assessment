package Assessment1;

import java.util.*;

public class Formdemo {

	public static void main(String[] args) {
		
		Form s1 = new Form();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Student Name :");
		String sname = sc.nextLine(); 
		System.out.println("Enter Student Roll.no :");
		int sroll = sc.nextInt(); 
		System.out.println("Enter Student Grade :");
		char grade = sc.next().charAt(0);
		System.out.println("Enter Student CGPA :");
		float percent = sc.nextFloat();
	
		System.out.println("Student name :"+sname);
		System.out.println("Student Roll.no :"+sroll);
		System.out.println("Grade :"+grade);
		System.out.println("CGPA :"+percent);
		
		
	
	}

	}


