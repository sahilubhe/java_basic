package day_5;

import java.util.Scanner;

public class Regex {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please, Enter Your email:");
		String phoneNumber = scan.nextLine();
		Boolean regexMatched = phoneNumber.matches("^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$");
		if (regexMatched)
			System.out.println("Validation successfull");
		else
			System.out.println("Validation Failed Please Enter valid email");
	}

}
