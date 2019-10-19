import java.util.Scanner;

public class Tarifa {

	public Tarifa() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	
		
		int x= in.nextInt();
		int n= in.nextInt();
		
		int total= 0;
		
		for(int i = 0; i < n; i++) {
			int pI= in.nextInt();
			total+= x-pI;
		}

		System.out.println(total + x);
	}

}
