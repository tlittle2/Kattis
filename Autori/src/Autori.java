import java.util.Scanner;

public class Autori {

	public Autori() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String input= in.nextLine();
		
		System.out.print(input.charAt(0));
		
		for(int i= 0; i < input.length()-1; i++) {
			if(input.charAt(i) == '-') {
				
				System.out.print(input.charAt(i+1));
			}
		}

	}

}
