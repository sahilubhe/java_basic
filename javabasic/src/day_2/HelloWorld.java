package day_2;

import java.util.Scanner;

public class HelloWorld {

	public HelloWorld() {
	}
	static int j =6;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello Sahil");
		int a = 50;
		int b = 70;
		System.out.println(a + b);
		System.out.println(a * b);
		System.out.println(a / b);
		int j = 8;
		j = 7;
		final int i = 4;
		System.out.println(i);
		System.out.println(j);
		
		String name = "sahil";
		System.out.println(name);
		
		int s = 33, r = 80, p = 21;
		
		float u = 45.1150f;
		System.out.println(u);
		System.out.println(s);
		boolean scam = true;
		System.out.println(scam);
		
		/*
		 * Two type of java Data Types:
		 *  Primitive - byte (1 byte), short (2 bytes), int (4 bytes), long, float 
		 *  non Primitive or Reference Data type 
		 */
		
		byte y = -36;
		System.out.println(y);
		double t = 67.989254d;
		System.out.println(t);
		
		char grade = 'v';
		System.out.println(grade);
		/*operators in java
		 */
		int num1 = 75;
		int num2 = 88;
		// Expoler these operator - += , -+ , *=,
		System.out.println("The value of num1 + num2 is");
		System.out.println(num1 + num2);
		
		System.out.println("The value of num1 - num2 is");
		System.out.println(num1 - num2);
		
		System.out.println("The value of num1 * num2 is");
		System.out.println(num1 * num2);
		
		//Taking user input in java 
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Input");
		String input = scan.nextLine();
		System.out.println(input);
	}

}
