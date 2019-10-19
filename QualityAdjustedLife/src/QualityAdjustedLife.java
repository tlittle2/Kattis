import java.util.Scanner;

public class QualityAdjustedLife {

	public QualityAdjustedLife() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		
		int numberofCycles= in.nextInt();
		double answer= 0;
		
		for(int i= 0; i < numberofCycles; i++) {
			double q= in.nextDouble();
			double y= in.nextDouble();
			
			answer= answer + (q*y);
			
		}
		
		System.out.println(answer);

	}

}
