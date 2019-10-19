import java.util.Scanner;

public class Oddities {

	public Oddities() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        
	        
	        int amountOfNumbers= in.nextInt();
	    
	        for(int i = 0; i < amountOfNumbers; i++) {
	            int number= in.nextInt();
	            
	            if(number % 2 == 0) {
	                System.out.println(number + " is even");
	            }else {
	                System.out.println(number + " is odd");
	            }
	        }

	        in.close();
	    }

}
