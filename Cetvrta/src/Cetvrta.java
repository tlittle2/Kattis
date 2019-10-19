import java.util.Scanner;

public class Cetvrta {

	public Cetvrta() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in= new Scanner(System.in);
			
		int x1= in.nextInt();
			int y1= in.nextInt();
		int x2= in.nextInt();
			int y2= in.nextInt();
		int x3= in.nextInt();
			int y3= in.nextInt();
			
		int missingX;
		int missingY;
		
		
		if(x1==x2) {
			missingX= x3;
		}else if(x2==x3) {
			missingX= x1;
		}else {
			missingX= x2;
		}
		
		if(y1 == y2) {
			missingY= y3;
		}else if(y2 == y3) {
			missingY= y1;
		}else {
			missingY= y2;
		}
	
		System.out.println(missingX +" "+ missingY);
			
		

	}

}
