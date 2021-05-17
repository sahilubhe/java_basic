package day_3;

import java.util.Scanner;

public class calculator {

	public calculator() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		double A ,B;
		System.out.println("A = ");
		A = scan.nextDouble();
		System.out.println("B = ");
		B = scan.nextDouble();
		
		System.out.println("For Addition enter +");
		System.out.println("For Substraction enter -");
		System.out.println("For Multiplication enter *");
		System.out.println("For Division enter /");
		
		
		System.out.println("Enter a symbol for calculation:");
		String s = scan.next();
		
		switch(s) {
		case "+":
			System.out.println(A+B);
		break;
		case "-":
			System.out.println(A-B);
		break;
		case "*":
			System.out.println(A*B);
		break;case "/":
			System.out.println(A/B);
		break;
		
		default:
			System.out.println("Enter a valid symbol.");
		}

	}

}
