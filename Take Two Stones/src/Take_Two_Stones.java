import java.util.Scanner;

public class Take_Two_Stones {

	public Take_Two_Stones() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		int input= in.nextInt();
		
		
		if(input % 2 == 1) {
			System.out.println("Alice");
			
		}else {
			System.out.println("Bob");
		}
	}

}
