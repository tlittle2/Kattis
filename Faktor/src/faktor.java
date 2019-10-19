import java.util.Scanner;

public class faktor {

	public faktor() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner in= new Scanner(System.in);
		    
	        int i1= in.nextInt();
	    
	        int i2= in.nextInt();
	        
	        int answer= i1*i2;
	        
	        while(((double) --answer /i1) > i2-1) {
	        }
	            System.out.println(++answer);
	        
		
			
	}

}
