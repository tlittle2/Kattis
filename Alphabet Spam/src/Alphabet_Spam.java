import java.util.Scanner;

public class Alphabet_Spam {

	public Alphabet_Spam() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		float numberOfWhiteSpaces= 0, numberOfLowerCase= 0, numberOfUpperCase= 0, numberOfSymbols= 0;
		
		
		String input= in.nextLine();
				
		for(int i= 0; i < input.length(); i++) {
			if(input.charAt(i)== '_') {
				numberOfWhiteSpaces++;
			}
			else if(Character.isLowerCase(input.charAt(i))) {
				numberOfLowerCase++;
			}else if(Character.isUpperCase(input.charAt(i))){
				numberOfUpperCase++;
			}else{
				numberOfSymbols++;
				
			}
			
		}
		
		System.out.println(numberOfWhiteSpaces / input.length());
		System.out.println(numberOfLowerCase / input.length());
		System.out.println(numberOfUpperCase / input.length());
		System.out.println(numberOfSymbols / input.length());

	}

}
