import java.util.Scanner;

public class Ladder {

	public Ladder() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner in= new Scanner (System.in);
		
		int oppositeAngle= in.nextInt();
		int angleInDegrees= in.nextInt();
		
		double adjacentAngle= oppositeAngle/Math.tan(Math.toRadians(angleInDegrees));
		double hypotenuse= Math.sqrt(Math.pow(oppositeAngle, 2) + Math.pow(adjacentAngle, 2));
		
		System.out.println((int)Math.ceil(hypotenuse));

	}

}
