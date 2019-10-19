import java.util.Scanner;

public class Coldputer_Science {

	public Coldputer_Science() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in= new Scanner(System.in);
		
		int tempsCollected= in.nextInt();
		
		int tempsBelowZero= 0;
		
		for(int i=0; i < tempsCollected; i++) {
			int temperature= in.nextInt();
			
			
					
					if(temperature < 0) {
						tempsBelowZero++;
					}
				
		}
		System.out.println(tempsBelowZero);

	}

}
