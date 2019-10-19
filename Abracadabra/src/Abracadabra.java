import java.util.Scanner;

public class Abracadabra {

	public Abracadabra() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int numberOfIterations= in.nextInt();
		
		for(int i = 1; i < numberOfIterations+1; i++) {
			System.out.println(i + " Abracadabra");
		}

	}

}
