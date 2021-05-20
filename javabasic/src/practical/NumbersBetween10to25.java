package practical;

public class NumbersBetween10to25 {

	public NumbersBetween10to25() {
		
	}

	public static void main(String[] args) {
		int i=10 , sum =0;
		
		while(i>=10 && i<=25)
		{
			sum=sum+i;
			i++;
		}
		System.out.println("sum of numbers between 10 to 25 :t"+sum);
	}

}
