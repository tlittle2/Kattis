import java.util.Scanner;

public class FizzBuzz {

	public FizzBuzz() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int divisibilityNumber= in.nextInt();
		int buzzNumber= in.nextInt();
		int endofSequence= in.nextInt();
		
		for(int i = 1; i < endofSequence+1; i++) {
			if(i % divisibilityNumber == 0 && i % buzzNumber==0) {
				System.out.println("FizzBuzz");
			}else if(i % divisibilityNumber == 0 ) {
				System.out.println("Fizz");
			}else if(i % buzzNumber == 0) {
				System.out.println("Buzz");
			
			}else{
			System.out.println(i);
			}
			
		}
		
	}
}
