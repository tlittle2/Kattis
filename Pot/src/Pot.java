import java.util.Scanner;

public class Pot {

	public Pot() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		
		int numberOfDigits= in.nextInt();
		
		int input;
		int output= 0;
		int exponent;
		
		for(int i = 0; i < numberOfDigits; i ++) {
			input= in.nextInt();
		
			exponent= input % 10;
			input= input / 10;
		
			output+= (int)Math.pow(input, exponent);
		}
		
		System.out.println(output);
		
		
		
		
		

	}

}
