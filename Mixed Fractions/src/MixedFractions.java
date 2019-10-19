import java.util.Scanner;

public class MixedFractions {

	public MixedFractions() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int numerator= in.nextInt();
		int denominator= in.nextInt();	
		
		int wholeNumber= 0;
		int newNumerator= 0;
		
		while(numerator != 0 || denominator !=0) {	
				
			wholeNumber= numerator/denominator;
			newNumerator= numerator % denominator;

			System.out.println(wholeNumber + " " + newNumerator + " / " + denominator);
			
			numerator= in.nextInt();
			denominator= in.nextInt();
		
			
			
		}

	}

}
