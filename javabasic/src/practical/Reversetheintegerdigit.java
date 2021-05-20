package practical;

public class Reversetheintegerdigit {

	public Reversetheintegerdigit() {
		
	}

	public static void main(String[] args) {
		int number=764;
		
		while (number!=0)
		{
			int r= number%10;
			System.out.println(r);
			number=number/10;
		}

	}

}
