package practical;

public class Oddnumberbetween10to20 {

	public Oddnumberbetween10to20() {
		int i=10;
		
		System.out.print("odd number from 10 to 20 are: \n");
		
		do {
			if(i%2==1) {
			System.out.print(i+"\n");
			}
			i++;
			}
		while(i>=10 && i<+20);
		
		}
}
