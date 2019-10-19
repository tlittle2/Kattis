import java.util.Scanner;

public class SimonSays {

	public SimonSays() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int numofSteps= in.nextInt();
		
		in.nextLine();
		
		for(int i= 0; i < numofSteps; i++) {
			String simonSays= in.nextLine();
			
			if(simonSays.startsWith("Simon says")) {
				System.out.println(simonSays.substring(10));
			}
			

		}

		in.close();
	}
	
}
