package practical;

import java.util.Scanner;

public class TypeCasting {

	public TypeCasting() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer value");
		int i = scan.nextInt();
		char ch = (char) i;
		System.out.println("character value of given integer is :" + ch);
	}
}
