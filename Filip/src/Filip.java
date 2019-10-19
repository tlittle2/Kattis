import java.util.Scanner;

public class Filip {

	public Filip() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int num1= in.nextInt();
		int num2= in.nextInt();
		
		int biggestNumber;
	
		int [] reverse1  = new int[3];
		int [] reverse2 = new int [3];
		
		reverse1[0]= num1 % 10;
			num1 = num1 / 10;
		
		reverse1[1]= num1 % 10;
			num1 = num1 / 10;
		
		reverse1[2]= num1 % 10;
			
		
		reverse2[0] = num2 % 10; 
				num2 = num2 / 10;
				
		reverse2[1] = num2 % 10; 
				num2 = num2 / 10;
				
		reverse2[2] = num2 % 10; 
			
		
		
		
		
		num1= reverse1[0] * 100 + reverse1[1] * 10 + reverse1[2];
		num2= reverse2[0] * 100 + reverse2[1] * 10 + reverse2[2];
		
		if(num1 > num2) {
			biggestNumber= num1;
		}else {
			biggestNumber= num2;
		}
		
		System.out.println(biggestNumber);
		
		
		
		
		

	}

}
