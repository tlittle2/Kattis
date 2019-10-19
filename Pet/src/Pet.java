import java.util.Scanner;

public class Pet {

	public Pet() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int[] numbers= new int[5];
		
		int index= 0;
		
				
		for(int i=0; i < 5; i++) {
			int total= 0;
			
			for (int j=0; j < 4; j++) {
				 total+= in.nextInt(); 
			}
			numbers[index]= total;
			index++;			
		}
		
		int participant= 0;
		int max= 0;
		for (int i= 0; i < 5; i++) {
			if(Math.max(max, numbers[i])== numbers[i]) {
				participant= i+1;
				max= numbers[i];
			}
		}
			System.out.println(participant + " " + max);
	}
		
	
		

	}
